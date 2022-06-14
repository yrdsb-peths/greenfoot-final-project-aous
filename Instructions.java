import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends World
{
    Label back = new Label ("Back", 40);
    Label instructions;
    int lineHeight = 50;
    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Instructions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(back, 100, 370);
        String[] line = {"Click where you want the apex to be",
        "Shoot as many targets as you can before", "the timer runs out",
        "Shoot the time to add to the timer",
        "Your final score shows how many targets", "you hit in the time",
        "Have fun ;)"};
        
        for (int i = 0; i < line.length; i++)
        {
            instructions = new Label(line[i], 30);
            instructions.setFillColor(Color.BLACK);
            instructions.setLineColor(Color.BLACK);
            addObject(instructions, getWidth()/2, 50 + lineHeight*i);
        }
    }
    
    public void act()
    {
                if(Greenfoot.mouseClicked(back))
        {
            TitleScreen titleScreenWorld = new TitleScreen();
            Greenfoot.setWorld(titleScreenWorld);
        }
    }
}
