package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import contract.IController;
import contract.IModel;

/**
 * The Class ViewFrame.
 *
 * @author Jean-Aymeric Diet
 */
class ViewFrame extends JFrame /*implements KeyListener*/ {

	/** The model. */
	private IModel						model;

	/** The controller. */
	private IController				controller;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -697358409737458175L;
	
	private JLabel text = new JLabel("Choice level");
	
	BufferedImage image;
	Graphics g;

	JButton button = new JButton("Level 1");
	JButton button2 = new JButton("Level 2");
	JButton button3 = new JButton("Level 3");
	JButton button4 = new JButton("Level 4");
	JButton button5 = new JButton("Level 5");
	/**
	 * Instantiates a new view frame.
	 *
	 * @param model
	 *          the model
	 * @throws HeadlessException
	 *           the headless exception
	 */
	public ViewFrame(final IModel model) throws HeadlessException {
		this.buildViewFrame(model);
	}

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model
	 *          the model
	 * @param gc
	 *          the gc
	 */
	public ViewFrame(final IModel model, final GraphicsConfiguration gc) {
		super(gc);
		this.buildViewFrame(model);
	}

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model
	 *          the model
	 * @param title
	 *          the title
	 * @throws HeadlessException
	 *           the headless exception
	 */
	public ViewFrame(final IModel model, final String title) throws HeadlessException {
		super(title);
		this.buildViewFrame(model);
	}

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model
	 *          the model
	 * @param title
	 *          the title
	 * @param gc
	 *          the gc
	 */
	public ViewFrame(final IModel model, final String title, final GraphicsConfiguration gc) {
		super(title, gc);
		this.buildViewFrame(model);
	}

	/**
	 * Gets the controller.
	 *
	 * @return the controller
	 */
	private IController getController() {
		return this.controller;
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	protected void setController(final IController controller) {
		this.controller = controller;

		button.addActionListener(new ButtonListener1());
		button2.addActionListener(new ButtonListener2(controller));
		button3.addActionListener(new ButtonListener3());
		button4.addActionListener(new ButtonListener4());
		button5.addActionListener(new ButtonListener5());
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	protected IModel getModel() {
		return this.model;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/**
	 * Builds the view frame.
	 *
	 * @param model
	 *          the model
	 */
	private void buildViewFrame(final IModel model) {
		this.setModel(model);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		//this.addKeyListener(this);
		this.setContentPane(new ViewPanel(this));
		this.setSize(704 + this.getInsets().left + this.getInsets().right, 480 + this.getInsets().top + this.getInsets().bottom);
		this.setLocationRelativeTo(null);
		this.setTitle("Lorann");
		JPanel pan = new JPanel();
		Font police = new Font("Tahoma", Font.BOLD, 16); 
		//this.setContentPane(pan);               
		//pan.setBackground(Color.black);
		pan.setLayout(new GridBagLayout());
	    GridBagConstraints gbc = new GridBagConstraints();

		text.setFont(police);
		text.setForeground(Color.BLACK);
		text.setHorizontalAlignment(JLabel.CENTER);
		
		image = ImageLoader.loadImage("/bone.png");
		g.drawImage(image, 32, 32, null);
		
		button.setPreferredSize(new Dimension(120, 70));
		button2.setPreferredSize(new Dimension(120, 70));
		button3.setPreferredSize(new Dimension(120, 70));
		button4.setPreferredSize(new Dimension(120, 70));
		button5.setPreferredSize(new Dimension(120, 70));
	
	    gbc.gridx = GridBagConstraints.HORIZONTAL;
	    pan.add(text, gbc);
	    pan.add(button, gbc);
	    pan.add(button2, gbc);
	    pan.add(button3, gbc);
	    pan.add(button4, gbc);
	    pan.add(button5, gbc);
		
	    this.setContentPane(pan);
		this.setVisible(true);
			
	}

	/**
	 * Prints the message.
	 *
	 * @param message
	 *          the message
	 */
	public void printMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	public void keyTyped(final KeyEvent e) {

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	/*public void keyPressed(final KeyEvent e) {
		this.getController().orderPerform(View.keyCodeToControllerOrder(e.getKeyCode()));
	}*/

	/*
	 * (non-Javadoc)
	 *
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	public void keyReleased(final KeyEvent e) {

	}
}
