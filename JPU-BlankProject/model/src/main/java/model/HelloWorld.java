package model;

import java.io.IOException;

/**
 * The Class HelloWorld.
 *
 * @author Jean-Aymeric Diet
 */
class HelloWorld extends Entity {

	/** The id. */
	private int			id;

	/** The key. */
	private String	key;

	/** The message. */
	private String	message;
	
	private String type_element;
	private int pos_x;
	private int pos_y;
	
	CreateElement createElement;

	/**
	 * Instantiates a new hello world.
	 *
	 * @param id
	 *          the id
	 * @param key
	 *          the key
	 * @param message
	 *          the message
	 */
	public HelloWorld(final String type_element, final int pos_x, final int pos_y) {
		this.setType_element(type_element);
		this.setPos_x(pos_x);
		this.setPos_y(pos_y);
		try {
			createElement = new CreateElement(type_element, pos_x, pos_y);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getType_element() {
		return type_element;
	}

	public void setType_element(String type_element) {
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

	/**
	 * Instantiates a new hello world.
	 */


	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *          the new id
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/**
	 * Gets the key.
	 *
	 * @return the key
	 */
	public String getKey() {
		return this.key;
	}

	/**
	 * Sets the key.
	 *
	 * @param key
	 *          the new key
	 */
	public void setKey(final String key) {
		this.key = key;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return this.message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message
	 *          the new message
	 */
	public void setMessage(final String message) {
		this.message = message;
	}

}
