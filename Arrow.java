import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Actor
{
    /**
     * Act - do whatever the arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Arrow()
    {
        GreenfootImage image = getImage();
        image.scale(60,60);
        setImage(image);
        //resizes image
    }
    public void act() 
    {
        // Add your action code here.
        
    }    
}
