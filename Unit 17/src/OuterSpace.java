//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;

	private AlienHorde horde;
	private Bullets shots;

	private boolean[] keys;
	private BufferedImage back;
	private boolean pressed;

	private int mem;
	
	public OuterSpace(int w, int h)
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
        ship = new Ship(400, 400);
        shots = new Bullets();
        horde = new AlienHorde();
        
        Alien[] aliens = new Alien[5];
        
        mem = aliens.length;
        
        for (int i = 0; i < aliens.length; i++) {
            aliens[i] = new Alien(100 * i, 30, 2);
            horde.add(aliens[i]);
        }
        
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);

		if (keys[0]) {
            ship.move("LEFT");
        }
        if (keys[1]) {
            ship.move("RIGHT");
        }
        if (keys[2]) {
            ship.move("DOWN");
        }
        if (keys[3]) {
            ship.move("UP");
        }
        if (keys[4] && !pressed) {
        		pressed = true;
        		shots.add(new Ammo((ship.getX() + ship.getWidth() / 2) - 5, ship.getY() - 5, 5));
        }

		//add code to move Ship, Alien, etc.
        if (ship.getX() < 0) {
            ship.setX(0);
        }
        if (ship.getX() > 800 - ship.getWidth()) {
            ship.setX(800 - ship.getWidth());
        }
        if (ship.getY() < 0) {
            ship.setY(0);
        }
        if (ship.getY() > 600 - ship.getHeight()) {
            ship.setY(600 - ship.getHeight());
        }
        
        ship.draw(graphToBack);
        shots.drawEmAll(graphToBack);
        shots.moveEmAll();
        shots.cleanEmUp();
        horde.drawEmAll(graphToBack);
        horde.moveEmAll();
		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
        
        for (int i = 0; i < mem; i++) {
        	if(shots.collision(horde.getAlien(i))){
            	horde.getAlien(i).setPos(-100, -100);;
    		}
        }
		
		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_H)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_K)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_U)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_J)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_H)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_K)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_U)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_J)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
			pressed = false;
			
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
     }
   	catch(Exception e)
    {
    }
   }
}

