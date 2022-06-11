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
        // Starts the game when spacebar is pressedd
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
        Archer archer = new Archer();
        addObject(archer,135,232);
        Arrow arrow = new Arrow();
        addObject(arrow,338,157);
        arrow.setLocation(302,153);
        Target target = new Target();
        addObject(target,449,218);
        target.setLocation(466,229);
        target.setLocation(455,233);
        target.setLocation(466,229);
        archer.setLocation(149,225);
        arrow.setLocation(314,160);
        Label label = new Label("Press <SPACE> To Start", 40);
        addObject(label,265,313);
        label.setLocation(337,347);
        label.setLocation(310,349);
        label.setLocation(367,348);
        label.setLocation(346,343);
        label.setLocation(326,360);
        label.setLocation(285,352);
        label.setLocation(338,346);
        label.setLocation(349,347);
        label.setLocation(292,353);
    }
}
