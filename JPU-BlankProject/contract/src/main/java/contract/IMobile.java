package contract;

public interface IMobile {
		
	public void setDirection();
	
	public IPosition getPosition();
	
	public IDimension getDimension();
	
	public int getWidth();
	
	public int getHeight();
	
	public int getSpeed();
	
	public int getImage();
	
	public int move();
	
	public boolean isWeapon();
	
	public boolean hit();
	
	public void setModel (IModel model);
	
}
