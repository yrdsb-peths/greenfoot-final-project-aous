import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndingScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndingScreen extends World
{
    int score;
    Label finalScore;
    Label menuButton;
    public EndingScreen(int score)
    {
        super(600,400,1);
        this.score = score;
        finalScore = new Label("Your Final Score Was: " + score,50);
        addObject(finalScore, 260,100);
        Label menuButton = new Label("Back To Main Menu", 50);
        addObject(menuButton, 220, 240);
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked(menuButton))
        {
            TitleScreen menu = new TitleScreen();
            Greenfoot.setWorld(menu);
        }
    }
}
