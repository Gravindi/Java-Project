package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HorizontalBoneTest {
	HorizontalBone horizontalbone;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.horizontalbone = new HorizontalBone(45,12);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGo() {
	}

	@Test
	public void testGetPos_x() {
		Assert.assertEquals(45, this.horizontalbone.getPos_x());
	}

	@Test
	public void testSetPos_x() {
		this.horizontalbone.setPos_x(45);
		Assert.assertEquals(45, this.horizontalbone.getPos_x());
	}

	@Test
	public void testGetPos_y() {
		Assert.assertEquals(12, this.horizontalbone.getPos_y());
	}

	@Test
	public void testSetPos_y() {
		this.horizontalbone.setPos_y(12);
		Assert.assertEquals(12, this.horizontalbone.getPos_y());
	}

}
