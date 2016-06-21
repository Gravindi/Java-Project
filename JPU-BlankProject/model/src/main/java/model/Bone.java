package model;


public class Bone extends Wall {
	public Bone(int pos_x, int pos_y) {
		image = ImageLoader.loadImage("/bone.png");
		System.out.println("pol");
		g.drawString("ghjy", 10, 10);
	}

}
