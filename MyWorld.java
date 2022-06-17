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
    }
    
    public void act()
    {
        timeLeft = 60 - (int) timer.millisElapsed()/1000;
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
            addObject(new Target(), spawnX + 200, 640);
            //adds new target in random location
        }
        
        if (timeLeft == 0)
        {
            Greenfoot.delay(100);
            Greenfoot.stop();
            TitleScreen titleScreenWorld = new TitleScreen();
            Greenfoot.setWorld(titleScreenWorld);
        }
    }
}
