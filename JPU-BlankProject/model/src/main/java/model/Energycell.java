package model;

public class Energycell extends Item {

	public Energycell(int pos_x, int pos_y) {

		image = ImageLoader.loadImage("/energycell.png");
		
		g.drawImage(image, pos_x, pos_y, null);
	}

	
	
}
