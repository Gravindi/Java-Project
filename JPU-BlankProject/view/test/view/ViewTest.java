package view;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.IModel;

public class ViewTest {
	View view;
	IModel model;
	ViewFrame viewFrame;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.view = new View(model);
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testKeyCodeToControllerOrder() {
		//fail("Not yet implemented");
	}

	@Test
	public void testPrintMessage() {
		//String message = "message";
		//this.viewFrame.printMessage(message);
		//Assert.assertArrayEquals(message, this.viewFrame.printMessage("message"));
	}

	@Test
	public void testRun() {
		//fail("Not yet implemented");
	}

	@Test
	public void testSetController() {
		//fail("Not yet implemented");
	}

}
