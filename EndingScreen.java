import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndingScreen here.
 * 
 * Aous Alomari and Nicholas Wu
 * June 20 2022
 */
public class EndingScreen extends World
{
    int score;
    Label finalScore;
    Label menuButton;
    GreenfootSound marioSound = new GreenfootSound("Super_Mario_Bros.wav");
    public EndingScreen(int score)
    {
        super(600,400,1);
        this.score = score;
        //set score variable in cunstructor which will be the final score of the game
        finalScore = new Label("Your Final Score Was: " + score,50);
        addObject(finalScore, 260,100);
        Label menuButton = new Label("Back To Main Menu", 50);
        addObject(menuButton, 220, 240);
        marioSound.play();
        //plays mario noise when ending screen is created
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked(menuButton))
        {
            TitleScreen menu = new TitleScreen();
            Greenfoot.setWorld(menu);
            marioSound.stop();
            //when the menu butotn is clicked, it sends player to title screen
        }
    }
}
