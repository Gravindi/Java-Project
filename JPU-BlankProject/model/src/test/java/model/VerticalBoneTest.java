package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VerticalBoneTest {
	VerticalBone verticalbone;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.verticalbone = new VerticalBone(45,12);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGo() {
	}

	@Test
	public void testGetPos_x() {
		Assert.assertEquals(45, this.verticalbone.getPos_x());
	}

	@Test
	public void testSetPos_x() {
		int as = 45;
		this.verticalbone.setPos_x(as);
		Assert.assertEquals(as, this.verticalbone.getPos_x());
	}

	@Test
	public void testGetPos_y() {
		Assert.assertEquals(12, this.verticalbone.getPos_y());
	}

	@Test
	public void testSetPos_y() {
		int er = 12;
		this.verticalbone.setPos_y(er);
		Assert.assertEquals(er, this.verticalbone.getPos_y());
	}
}
