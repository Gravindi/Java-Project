package model;

public class CreateMap {
	private String type_element;
	private int pos_x, pos_y;
	
	public CreateMap(String type_element, int pos_x, int pos_y){
		this.type_element = type_element;
		this.pos_x = pos_x;
		this.pos_y = pos_y;
	}

	public String getTypeElement() {
		return type_element;
	}

	public void setTypeElement(String type_element) {
		this.type_element = type_element;
	}

	public int getPos_x() {
		return pos_x;
	}

	public void setPos_x(int pos_x) {
		this.pos_x = pos_x;
	}

	public int getPos_y() {
		return pos_y;
	}

	public void setPos_y(int pos_y) {
		this.pos_y = pos_y;
	}
}
