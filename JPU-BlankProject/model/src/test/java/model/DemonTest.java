package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class DemonTest {
	Demon demon;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.demon = new Demon("1", 64, 128);
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGetPos_x() {
		Assert.assertEquals(64, this.demon.getPos_x());
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGetPos_y() {
		Assert.assertEquals(128, this.demon.getPos_y());
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGetDemonNumber() {
		Assert.assertEquals("1", this.demon.getDemonNumber());
	}

}
