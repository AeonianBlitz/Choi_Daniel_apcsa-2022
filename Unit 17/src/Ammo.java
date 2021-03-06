//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
    private Image image;
	
    public Ammo()
    {
    	this(0, 0, 1);
    }
    
	public Ammo(int x, int y)
	{
        this(x, y, 1);
	}

	public Ammo(int x, int y, int s)
	{
        super(x, y);
        speed = s;
        
        try
        {
        	image = ImageIO.read(new File("C:\\Users\\Aeoni\\Desktop\\APCSA_Units_2022\\Choi_Daniel_apcsa-2022\\Unit 17\\src\\images\\ammo.jpg"));
            //URL url = getClass().getResource("C:\\Users\\Aeoni\\Desktop\\APCSA_Units_2022\\Choi_Daniel_apcsa-2022\\Unit 17\\src\\images\\ammo.jpg");
            //image = ImageIO.read(url);
        } catch (Exception e) {
        	System.out.println("Error Loading Ammo Image");
        }
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
        window.drawImage(image, getX(), getY(), 5, 10, null);
	}
	
	
	public void move( String direction )
	{
        if (direction.equals("UP")) {
            super.setY(super.getY() - speed);
        }
        if (direction.equals("DOWN")) {
            super.setY(super.getY() + speed);
        }
        if (direction.equals("RIGHT")) {
            super.setX(getX() + speed);
        }
        if (direction.equals("LEFT")) {
            super.setX(getX() - speed);
        }
	}

	public String toString()
	{
		return "";
	}
}
