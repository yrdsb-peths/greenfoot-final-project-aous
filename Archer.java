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

    /**
     * Act - do whatever the Archer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */  
    
    public void act()
    {
        /**if (Greenfoot.mouseClicked(null))
        *{
        *    shoot();
        *}
        */
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (Greenfoot.mouseMoved(this.getWorld()))
        {
            if (getY() - mouse.getY() < 25)
            {
                setImage("images/archersfolder/archers1.png");
            }else
            {
                setImage("images/archersfolder/archers12.png");
            }
        }
        
    }
    
    private void shoot()
    {
        for (int i = 0; i < 6; i++)
        {
            archers[i] = new GreenfootImage("images/archersfolder/archers" + i + ".png");
        }
    }
}
