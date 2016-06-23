package model;

import java.io.IOException;

public class CreateElement {
	
	private Element element;
	
	public CreateElement(String type_element, int pos_x, int pos_y) throws IOException{
		System.out.println(type_element + pos_x + pos_y);
		int switchIntString;
		element = new Element();
		switch (type_element) {
		case "L" : 
			Character character = new Character(pos_x, pos_y);
			Array.Character.add(character);
			element.add(character);
			break;
		case "E" :
			Energycell energycell;
			Array.Energycell.add(energycell = new Energycell(pos_x, pos_y));
			element.add(energycell);
			break;
		case "D" : 
			Mask mask;
			Array.Mask.add(mask = new Mask(pos_x, pos_y));
			element.add(mask);
			break;
		case "B" :
			Bone bone = new Bone(pos_x, pos_y);
			Array.Bone.add(bone);
			element.add(bone);
			break;
		case "H" : 
			HorizontalBone horizontalbone;
			Array.HorizontalBone.add(horizontalbone = new HorizontalBone(pos_x, pos_y));
			element.add(horizontalbone);
			break;
		case "V" :
			VerticalBone verticalbone;
			Array.VerticalBone.add(verticalbone = new VerticalBone(pos_x, pos_y));
			element.add(verticalbone);
			break;
		case "1" :
			Demon demon1;
			Array.Demon.add(demon1 = new Demon(type_element, pos_x, pos_y));
			element.add(demon1);
			break;
		case "2" :
			Demon demon2;
			Array.Demon.add(demon2 = new Demon(type_element, pos_x, pos_y));
			element.add(demon2);
			break;
		case "3" :
			Demon demon3;
			Array.Demon.add(demon3 = new Demon(type_element, pos_x, pos_y));
			element.add(demon3);
			break;
		case "4" : 
			Demon demon4;
			Array.Demon.add(demon4 = new Demon(type_element, pos_x, pos_y));
			element.add(demon4);
			break;
		case "G" : 
			Gold gold;
			Array.Gold.add(gold = new Gold(pos_x, pos_y));
			element.add(gold);
			break;
		}
	}
	
}
