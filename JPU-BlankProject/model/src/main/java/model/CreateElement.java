package model;

import java.io.IOException;

public class CreateElement {
	
	Element element;
	
	public CreateElement(String type_element, int pos_x, int pos_y) throws IOException{
		System.out.println(type_element);
		switch (type_element) {
		case "L" : 
			Array.Character.add(new Character(pos_x, pos_y));
			element.add(Array.Character);
			break;
		case "E" :
			Array.Energycell.add(new Energycell(pos_x, pos_y));
			break;
		case "D" : 
			Array.Mask.add(new Mask(pos_x, pos_y));
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
			Array.Demon.add(new Demon(type_element, pos_x, pos_y));
			break;
		case "2" :
			Array.Demon.add(new Demon(type_element,pos_x, pos_y));
			break;
		case "3" :
			Array.Demon.add(new Demon(type_element, pos_x, pos_y));
			break;
		case "4" : 
			Array.Demon.add(new Demon(type_element, pos_x, pos_y));
			break;
		case "G" : 
			Array.Gold.add(new Gold(pos_x, pos_y));
			break;
		}
	}
	
}
