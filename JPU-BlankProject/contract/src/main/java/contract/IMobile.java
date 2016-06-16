package contract;

import java.awt.Dimension;

public interface IMobile {
	
	public Direction getDirection();
	
	public void setDirection();
	
	public Position getPosition();
	
	public Dimension getDimension();
	
	public int getWidth();
	
	public int getHeight();
	
	public int getSpeed();
	
	public int getImage();
	
	public int move();
	
	public boolean isWeapon();
	
	public boolean hit();
	
	public void setModel (IModel model);
	
}
