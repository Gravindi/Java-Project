package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import contract.IController;
import contract.IModel;

public class ButtonListener2 implements ActionListener {
	IModel model;
	IController controller;
	public void setController(IController controller){
		this.controller = controller;
	}
	public ButtonListener2(IController controller){
		this.controller = controller;
	}
	public void actionPerformed(ActionEvent e) {
		this.model.loadMessage();
	}

}
