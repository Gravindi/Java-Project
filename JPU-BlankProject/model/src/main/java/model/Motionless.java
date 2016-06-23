package model;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Motionless extends Element {

	protected BufferedImage image;
	private final static int WIDTH = 32;
	private final static int HEIGHT = 32;
	protected Graphics g;
	
	public boolean hit(){
		return false;
		
	}
	
	public int getHeight(){
		return 0;
		
	}
	
	public int getWidth(){
		return 0;
		
	}

	public String getImage(){
		return null;
		
	}
	
	public void getPosition(){
		
	}
	
	public void getDimension(){
		
	}
}
