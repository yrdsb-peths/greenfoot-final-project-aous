import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target extends Actor
{
    /**
     * Act - do whatever the Target wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Target()
    {
        GreenfootImage image = getImage();
        image.scale(100,120);
        setImage(image);
    }
    
    public void act()
    {
        if (isTouching(Arrow.class))
        {
            removeTouching(Arrow.class);
            getWorld().removeObject(this);
        }
    }
}
