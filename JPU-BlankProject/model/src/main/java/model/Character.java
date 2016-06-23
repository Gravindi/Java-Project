package model;

import contract.Direction;

public class Character extends Mobile {
	public boolean movement = false;
	int pos_x, pos_y;
	public Character(int pos_x, int pos_y) {
		super(pos_x, pos_y);
		this.pos_x = pos_x;
		this.pos_y = pos_y;
		go();
	}
	public void go(){
		//while(movement == false){
			image = ImageLoader.loadImage("/lorann_b.png");
			image = ImageLoader.loadImage("/lorann_bl.png");
			image = ImageLoader.loadImage("/lorann_b.png");
			image = ImageLoader.loadImage("/lorann_l.png");
			image = ImageLoader.loadImage("/lorann_ul.png");
			image = ImageLoader.loadImage("/lorann_u.png");
			image = ImageLoader.loadImage("/lorann_ur.png");
			image = ImageLoader.loadImage("/lorann_r.png");
			image = ImageLoader.loadImage("/lorann_br.png");
		//}
	}

	public int getPos_x() {
		return pos_x;
	}
	public void setPos_x(int pos_x) {
		this.pos_x = pos_x;
	}
	public int getPos_y() {
		return pos_y;
	}
	public void setPos_y(int pos_y) {
		this.pos_y = pos_y;
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



