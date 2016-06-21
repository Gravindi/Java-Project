package model;

public class Demon extends Mobile {
	
	private String demonNumber;
	private Position position;
	private static Dimension dimension;

	public Demon(String denomNumber, int pos_x, int pos_y) {
		super(pos_x, pos_y);
		image = ImageLoader.loadImage("/textures/src/main/resources/monster_" + denomNumber + ".png/");
		
		g.drawImage(image, pos_x, pos_y, null);
	}
	

}
