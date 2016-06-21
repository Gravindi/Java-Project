package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import contract.IController;

public class ButtonListener2 implements ActionListener {
	private IController controller;
	String type_element;
	public void setController(final IController controller){
		this.controller = controller;
	}
	public ButtonListener2(IController controller){
		this.controller = controller;
	}
	public void actionPerformed(ActionEvent e) {
		this.controller.loadMessage();
		go();
	}
	public void go(){
		JFrame test  = new JFrame();
		test.setTitle("Level 1");
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setSize(704, 480);
		test.setVisible(true);
	}
}
