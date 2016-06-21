package model;

import java.util.ArrayList;

public class Element {
	protected ArrayList<Element> listeElement = new ArrayList<Element>();
	public void add(Element nElement){
		listeElement.add(nElement);
	}
}
