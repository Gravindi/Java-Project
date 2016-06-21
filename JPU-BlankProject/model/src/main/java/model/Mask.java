package model;

public class Mask extends Item {

	public Mask(int pos_x, int pos_y) {
		image = ImageLoader.loadImage("/textures/src/main/resources/gate_closed.png/");
		
		g.drawImage(image, pos_x, pos_y, null);
	}

}
