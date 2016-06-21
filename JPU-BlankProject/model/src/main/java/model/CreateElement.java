package model;

import java.io.IOException;

public class CreateElement {
	
	public CreateElement(String type_element, int pos_x, int pos_y) throws IOException{
		switch (type_element) {
		case "L" : 
			Array.Character.add(new Character(pos_x, pos_y));
			break;
		case "E" :
			Array.Energycell.add(new Energycell(pos_x, pos_y));
			break;
		case "D" : 
			Array.Door.add(new Door(pos_x, pos_y));
			break;
		case "B" :
			Array.Bone.add(new Bone(pos_x, pos_y));
			break;
		case "H" : 
			Array.HorizontalBone.add(new HorizontalBone(pos_x, pos_y));
			break;
		case "V" :
			Array.VerticalBone.add(new VerticalBone(pos_x, pos_y));
			break;
		case "1" :
			Array.Demon.add(new Demon(pos_x, pos_y));
			break;
		case "2" :
			Array.Demon.add(new Demon(pos_x, pos_y));
			break;
		case "3" :
			Array.Demon.add(new Demon(pos_x, pos_y));
			break;
		case "4" : 
			Array.Demon.add(new Demon(pos_x, pos_y));
			break;
		case "G" : 
			Array.Gold.add(new Gold(pos_x, pos_y));
			break;
		}
	}
	
}
