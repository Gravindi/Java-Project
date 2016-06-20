package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ButtonListener1 implements ActionListener {
	public void actionPerformed(ActionEvent e){
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
