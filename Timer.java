import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 * 
 * Aous Alomari and Nicholas Wu
 * June 20 2022
 */
public class Timer extends Actor
{
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int time;
    Label timer;
    public Timer(int startTime)
    {
        time = startTime;
        timer = new Label(time, 100);
    }
    
    public void act()
    {
        time--;
        Greenfoot.delay(1);
        timer.setValue(time);
    }
}
