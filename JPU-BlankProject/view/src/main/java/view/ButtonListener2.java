package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import contract.IModel;

public class ButtonListener2 implements ActionListener {
	IModel model;
	public void actionPerformed(ActionEvent e) {
		model.loadMessage();
	}

}
