package model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import contract.Direction;

public class Mobile extends Element {
	
	private final static int SPEED = 5;
	private final static int WIDTH = 32;
	private final static int HEIGHT = 32;
	protected BufferedImage image;
	protected Graphics g;

	public Mobile (int pos_x, int pos_y){
		
	}
	public Direction getDirection(){
		 return null;
		 
	 }
	 
	 public void setDirection(){
		 
	 }
	 
	 public Position getPosition(){
		 return null;
	 }
	 
	 public Dimension getDimension(){
		return null;
		 
	 }
	 
	 public int getSpeed(){
		 return SPEED;
	 }
	
	 public int getWidth(){
		 return WIDTH;
	 }
	 
	 public int getHeight(){
		 return HEIGHT;
	 }
	 
	 public void move(){
		 
	 }
	 
	 public Image getImage(){
		 return image;
	 }
	 
	 public boolean hit(){
		 return false;
	 }
	

}
