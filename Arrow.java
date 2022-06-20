import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arrow here.
 * 
 * Aous Alomari and Nicholas Wu
 * June 20 2022
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
    boolean isShooting = false;
    public void act() 
    {
        // Add your action code here.
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if (Greenfoot.mouseClicked(null) && !isShooting)
        {
            vertexX = mouse.getX() - 110;
            vertexY = mouse.getY();
        }
        int speed = 6;
        if (vertexY != 0)
        {
            setLocation(getX() + speed,(int) (((600-vertexY)/(vertexX*vertexX))*(x-vertexX)*(x-vertexX) + vertexY));
            x += speed;
            if (getX() < vertexX + 110)
            {
                setRotation(-10);
            }else
            {
                setRotation(120);
            }
            isShooting = true;
        }
        
        if(getY() > 615)
        {
            vertexY = 0;
        }
        
        
    }
    
    
}