package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GoldTest {
	Gold gold;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.gold = new Gold (75, 12);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetPos_x() {
		Assert.assertEquals(75, this.gold.getPos_x());
	}

	@Test
	public void testGetPos_y() {
		Assert.assertEquals(12, this.gold.getPos_y());
	}

}
