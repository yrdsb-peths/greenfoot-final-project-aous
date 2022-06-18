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
    Arrow arrow;
    public Target()
    {
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
    }
    
    public void act()
    {
        if (isTouching(Arrow.class))
        {
            getWorld().removeObject(this);
        }
    }
}
