package model;

public class Demon extends Mobile {
	int pos_x, pos_y;
	String demonNumber;
	public Demon(String demonNumber, int pos_x, int pos_y) {
		super(pos_x, pos_y);
		this.pos_x = pos_x;
		this.pos_y = pos_y;
		this.demonNumber = demonNumber;
		go(demonNumber);
	}
	public void go(String demonNumber){
		this.demonNumber = demonNumber;
		image = ImageLoader.loadImage("/monster_" + demonNumber + ".png");
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
	public String getDemonNumber() {
		return demonNumber;
	}
	public void setDemonNumber(String demonNumber) {
		this.demonNumber = demonNumber;
	}
		
	

}
