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
        Archer x = new Archer();
        addObject(x,100,610);
        
        Target y = new Target();
        addObject(y, 750,615);
        
        Arrow z = new Arrow();
        addObject(z, 110, 610);
        
    }
    
}
