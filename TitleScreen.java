import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class TitleScreen here.
 * 
 * @author Nicholas 
 * @version June 2022
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Arrow Man", 100);
    /**
     * The title screen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, 300, 80);
        prepare();
    }

    public void act()
    {
        // Starts the game when spacebar is pressed
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Press <SPACE> To Start", 40);
        addObject(label,292,353);
    }
}
