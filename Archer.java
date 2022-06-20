import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Archer here.
 * 
 * Aous Alomari and Nicholas Wu
 * June 20 2022
 */
public class Archer extends Actor
{
    int mouseDifference;
    GreenfootImage[] archers = new GreenfootImage[6];

    /**
     * Act - do whatever the Archer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */  
    public Archer()
    {
        for(int i=0; i <archers.length; i++)
        {
            archers[i] = new GreenfootImage("images/archersfolder/archers" + i + ".png");
        }
        setImage(archers[0]);
    }

    /**
     * Shooting animation for the archer
     */
    int imageIndex = 1;
    public void shoot()
    {
        setImage(archers[imageIndex]);
        imageIndex++;

    }
    
    public void act()
    {
        
        if (Greenfoot.mouseClicked(null))
        {
            for(int i = 0; i<5; i++)
            {
                shoot();
                Greenfoot.delay(3);
            }
            imageIndex = 1;
        }
        
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (Greenfoot.mouseMoved(this.getWorld()))
        {
            if (getY() - mouse.getY() < 25)
            {
                setImage("images/archersfolder/archers0.png");
            }else
            {
                setImage("images/archersfolder/archers1.png");
            }
        }
        
    }
}
