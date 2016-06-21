package model;

public class Demon extends Mobile {
	public Demon(String denomNumber, int pos_x, int pos_y) {
		super(pos_x, pos_y);
		image = ImageLoader.loadImage("/monster_" + denomNumber + ".png");
		
		g.drawImage(image, pos_x, pos_y, null);
	}
	

}
