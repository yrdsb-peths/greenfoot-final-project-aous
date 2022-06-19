import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    SimpleTimer timer;
    Label x;
    int spawnX;
    int timeLeft;
    Arrow arrow;
    int score = 0;
    Label z;
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
        
        x = new Label(60, 100);
        addObject(x, 100, 100);
        
        z = new Label(score, 100);
        addObject(z, 700, 100);
        
    }
    
    public void act()
    {
        timeLeft = 5 - (int) timer.millisElapsed()/1000;
        x.setValue(timeLeft);
        
        if (arrow.getY() >= 615)
        {
            removeObject(arrow);
            arrow = new Arrow();
            addObject(arrow, 110, 610);
            
        }
        
        if (getObjects(Target.class).size() == 0)
        {
            spawnX = (int) (Math.random() * 300);
            addObject(new Target(), spawnX + 300, 640);
            removeObject(arrow);
            arrow = new Arrow();
            addObject(arrow, 110, 610);
            score++;
            z.setValue(score);
            //adds new target in random location
        }
        
        if (timeLeft == 0)
        {
            Greenfoot.delay(100);
            EndingScreen endWorld = new EndingScreen(score);
            Greenfoot.setWorld(endWorld);
        }
        
    }
    
    
}
