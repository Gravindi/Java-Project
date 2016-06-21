package model;

public class HorizontalBone extends Wall {

	public HorizontalBone(int pos_x, int pos_y) {

		image = ImageLoader.loadImage("/textures/src/main/resources/horizontal_bone.png/");
		
		g.drawImage(image, pos_x, pos_y, null);
	}

}
