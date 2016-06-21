package model;

public class Gold extends Item {
	
	int score;
	
	public Gold(int pos_x, int pos_y) {

		image = ImageLoader.loadImage("/purse.png");
		
		g.drawImage(image, pos_x, pos_y, null);
	}

	public int getScore(){
		return score;
	}
	
	public void setScore(int score){
		
	}

}
