import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Background img0, img1;
    private IronMan man;
    private int counter = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(930, 700, 1, false); 
        img0 = new Background();
        addObject(img0, getWidth()/2, getHeight()/2);
        img1 = new Background();
        addObject(img1, getWidth() + getWidth()/2, getHeight()/2);
        man = new IronMan();
        addObject(man,163,120);
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            img0.scroll();
            img1.scroll();
            
        }
        counter++;
        
        if(counter >= 20)
        {
            createRndmObjs();
            counter = 0;
        }
        
        
       
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void createRndmObjs()
    {
           int y = ((Greenfoot.getRandomNumber(700)));
           if(y < 200) y = y + 50;
           int x = Greenfoot.getRandomNumber(2000) + 1000 + man.getX();
           Objects alienShip = new Objects(x, y);
           if((Greenfoot.getRandomNumber(1000)) < 200)
           {
               addObject(alienShip,x,y);
           } 
    }
    
}
