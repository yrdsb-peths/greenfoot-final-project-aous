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
    double x = 0;
    double h = 400;
    double a = 400;
    public void act() 
    {
        // Add your action code here.
        MouseInfo mouse = Greenfoot.getMouseInfo();
        setLocation(this.getX() + 1,(int) ((a/(h*h))*(x-h)*(x-h) - (a - 600.0)));
        x += 1;

    }
        
}
