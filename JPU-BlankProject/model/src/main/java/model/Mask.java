package model;

public class Mask extends Item {

	int pos_x, pos_y;
	public Mask(int pos_x, int pos_y) {
		this.pos_x = pos_x;
		this.pos_y = pos_y;
		go();
	}
	public void go(){
		image = ImageLoader.loadImage("/gate_closed.png");
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

}
