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
    Label instructions = new Label("Instructions", 40);
    Label play = new Label("Play", 40);
    MouseInfo mouse = Greenfoot.getMouseInfo();
    GreenfootSound mythbustSound = new GreenfootSound("sounds/Mythbusters - Theme Song (HD).mp3");
    /**
     * The title screen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, 300, 80);
        addObject(instructions, 150, 200);
        addObject(play, 450, 200);
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(instructions))
        {
            Instructions instructionsWorld = new Instructions();
            Greenfoot.setWorld(instructionsWorld);
        }
        
        if(Greenfoot.mouseClicked(play))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
            mythbustSound.play();
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
}
