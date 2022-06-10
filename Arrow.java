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
    double h = 10;
    double a = 400;
    double vertexX;
    double vertexY;
    public void act() 
    {
        // Add your action code here.
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        
        if (Greenfoot.mouseClicked(null))
        {
            vertexX = mouse.getX() - 110;
            vertexY = mouse.getY();
            
        }
        if (vertexY != 0)
        {
            setLocation(getX() + 1,(int) (((600-vertexY)/(vertexX*vertexX))*(x-vertexX)*(x-vertexX) + vertexY));
            x += 1;
            if (getX() < vertexX + 110)
            {
                setRotation(-10);
            }else
            {
                setRotation(120);
            }
        }
        
        if(getY() > 620)
        {
            Greenfoot.stop();
        }
    }
        
}
