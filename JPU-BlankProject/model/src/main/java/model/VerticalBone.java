package model;

public class VerticalBone extends Wall {

	public VerticalBone(int pos_x, int pos_y) {
		image = ImageLoader.loadImage("/vertical_bone.png");
		
		g.drawImage(image, pos_x, pos_y, null);
	}

}
