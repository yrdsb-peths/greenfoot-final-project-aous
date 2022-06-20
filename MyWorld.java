import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * Aous Alomari and Nicholas Wu
 * June 20 2022
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    SimpleTimer timer;
    Label time;
    int spawnX;
    int timeLeft = 60;
    Arrow arrow;
    int score = 0;
    Label z;
    Label powerUp;
    SimpleTimer powerUpTimer;
    int powerUpValue = 5;
    int newPowerUpValue;
    int additionalTime;
    boolean timerForward;
    boolean timerUp;
    public MyWorld()
    { 
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1);
        
        Archer archer = new Archer();
        addObject(archer,100,610);
        
        Target target = new Target();
        addObject(target, 750,640);
        
        arrow = new Arrow();
        addObject(arrow, 110, 610);
        
        timer = new SimpleTimer();
        
        time = new Label(60, 100);
        addObject(time, 100, 100);
        
        z = new Label(score, 100);
        addObject(z, 700, 100);
        
        powerUpTimer = new SimpleTimer();
        powerUp = new Label(20, 100);
        timerForward = true;
        timerUp = true;
        addObject(powerUp, 200, 200);
    }
    
    public void act()
    {
        timeLeft = 20 - (int) timer.millisElapsed()/1000 + additionalTime;
        time.setValue(timeLeft);
        //sets value of the amount of time left
        powerUpValue = newPowerUpValue - (int) powerUpTimer.millisElapsed()/1000;
        powerUp.setValue(powerUpValue);
        //updates the value of the powerUp
        if (arrow.getY() >= 615 || arrow.getX() >= getWidth() - 10)
        {
            arrowInitialize();
            //initializes arrow if it is out of bounds
        }
        
        if (getObjects(Target.class).size() == 0)
        {
            spawnX = (int) (Math.random() * 300);
            addObject(new Target(), spawnX + 300, 640);
            arrowInitialize();
            score++;
            z.setValue(score);
            //adds new target in random location and initializes arrow
        }
        
        if (timeLeft == 0)
        {
            Greenfoot.delay(100);
            EndingScreen endWorld = new EndingScreen(score);
            Greenfoot.setWorld(endWorld);
            //changes world to ending screen if time runs out
        }
        
        setDirection();
        //method for direction of power up
        
        if (powerUp.isTouchingArrow())
        {
           additionalTime += powerUpValue;
           arrowInitialize();
           powerUpInitialize();
           /*initializes the power up and arrow
            * while increasing the time
            */
        }
        
        if (powerUpValue == 0)
        {
            powerUpInitialize();
            //resets value of power up and location when the time is 0
        }
        
        
    }
    
    public void powerUpInitialize()
    {
        powerUp.setLocation((int) (Math.random() * 600) + 200, (int) (Math.random() * 450) + 50);
        powerUpTimer = new SimpleTimer();
        powerUpValue = (int) (Math.random() * 15);
        newPowerUpValue = powerUpValue;
    }
    //resets value and location of the power up
    
    public void arrowInitialize()
    {
        removeObject(arrow);
        arrow = new Arrow();
        addObject(arrow, 110, 610);
    }
    //resets the arrow
    
    public void setDirection()
    {
        
        if(powerUp.getX() >= powerUp.getWorld().getWidth() - 10)
        {
            timerForward = false;
        }else if (powerUp.getX() <= 150)
        {
            timerForward = true;
        }
        if (powerUp.getY() <= 50)
        {
            timerUp = false;
        }else if (powerUp.getY() >= 600)
        {
            timerUp = true;
        }
        //changes the boolean values of whether the power up timer should be moving forward or up
        
        if (timerForward && timerUp)
        {
            powerUp.setLocation(powerUp.getX() + powerUpValue, powerUp.getY() - powerUpValue);
        }else if (!timerForward && timerUp)
        {
            powerUp.setLocation(powerUp.getX() - powerUpValue, powerUp.getY() - powerUpValue);
        }else if (timerForward && !timerUp)
        {
            powerUp.setLocation(powerUp.getX() + powerUpValue, powerUp.getY() + powerUpValue);
        }else
        {
            powerUp.setLocation(powerUp.getX() - powerUpValue, powerUp.getY() + powerUpValue);
        }
        //changes the direction of the power up timer
    }
}
