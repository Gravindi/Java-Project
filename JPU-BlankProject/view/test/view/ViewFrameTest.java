package view;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.IController;
import contract.IModel;

public class ViewFrameTest {
	ViewFrame viewframe;
	IModel model;
	IController controller;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.viewframe = new ViewFrame(model);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetController() {
		this.controller = controller;
		Assert.assertEquals(controller, controller);
	}

	@Test
	public void testGetModel() {
		Assert.assertEquals(model, this.viewframe.getModel());;
	}

	/*@Test
	public void testPrintMessage() {
		String message;
		Assert.assertEquals(message, this.viewframe.printMessage);
	}*/
}
