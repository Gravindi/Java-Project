package model;

import contract.Direction;

public class Character extends Mobile {
	public boolean movement = false;
	public Character(int pos_x, int pos_y) {
		super(pos_x, pos_y);
		while(movement == false){
		image = ImageLoader.loadImage("/textures/src/main/resources/lorann_b.png/");
		g.drawImage(image, pos_x, pos_y, null);
		image = ImageLoader.loadImage("/textures/src/main/resources/lorann_bl.png/");
		g.drawImage(image, pos_x, pos_y, null);
		image = ImageLoader.loadImage("/textures/src/main/resources/lorann_b.png/");
		g.drawImage(image, pos_x, pos_y, null);
		image = ImageLoader.loadImage("/textures/src/main/resources/lorann_l.png/");
		g.drawImage(image, pos_x, pos_y, null);
		image = ImageLoader.loadImage("/textures/src/main/resources/lorann_ul.png/");
		g.drawImage(image, pos_x, pos_y, null);
		image = ImageLoader.loadImage("/textures/src/main/resources/lorann_u.png/");
		g.drawImage(image, pos_x, pos_y, null);
		image = ImageLoader.loadImage("/textures/src/main/resources/lorann_ur.png/");
		g.drawImage(image, pos_x, pos_y, null);
		image = ImageLoader.loadImage("/textures/src/main/resources/lorann_r.png/");
		g.drawImage(image, pos_x, pos_y, null);
		image = ImageLoader.loadImage("/textures/src/main/resources/lorann_br.png/");
		g.drawImage(image, pos_x, pos_y, null);
		}
	}

	public boolean isplayer(){
		return false;
		
	}
	
	public boolean isWeapon(){
		return false;
		
	}
	
	private void moveUp(){
		
	}
	
	private void moveDown(){
		
	}
	
	private void moveRight(){
		
	}

	private void moveLeft(){
		
	}
	
	private Direction Lorann(Position position){
		return null;
		
	}
	
}



