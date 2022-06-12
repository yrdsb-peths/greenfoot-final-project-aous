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
    public MyWorld()
    { 
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1);
        
        Archer archer = new Archer();
        addObject(archer,100,610);
        
        Target target = new Target();
        addObject(target, 750,615);
        
        Arrow arrow = new Arrow();
        addObject(arrow, 110, 610);
        
        Timer timer = new Timer(60);
        addObject(timer, 90, 90);
    }
    
}
