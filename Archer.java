import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Archer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Archer extends Actor
{
    int mouseDifference;
    GreenfootImage[] archers = new GreenfootImage[6];
    GreenfootImage idleLeft = new GreenfootImage("images/archersfolder/archers12.png");
    GreenfootImage idleRight = new GreenfootImage("images/archersfolder/archers12.png");
    /**
     * Act - do whatever the Archer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Archer()
    {
        setImage("images/archersfolder/archers1.png");
    }
    
    public void act()
    {
        /**if (Greenfoot.mouseClicked(null))
        *{
        *    shoot();
        *}
        */
        MyWorld world = (MyWorld) getWorld();
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (Greenfoot.mouseMoved(world))
        {
            if (getY() - mouse.getY() < 30)
            {
                setImage("images/archersfolder/archers1.png");
            }
            
            if (getY() - mouse.getY() > 30)
            {
                setImage("images/archersfolder/archers12.png");
            }
            
        }
        
        
    }
}
