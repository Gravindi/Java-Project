package model;


public class Bone extends Wall {
	public Bone(int pos_x, int pos_y) {
		image = ImageLoader.loadImage("/textures/src/main/resources/bone.png/");
		
		g.drawImage(image, pos_x, pos_y, null);
	}

}
