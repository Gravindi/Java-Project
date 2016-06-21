package model;

import java.awt.Image;

public class FireBall extends Mobile {
	
	private Image image;
	private static Dimension dimension;
	
	public Image getImage(){
		 return image;
	 }
	
	public void move(){
		
	}
	
	public FireBall(int pos_x, int pos_y){
		super(pos_x, pos_y);
	}
	
	

}
