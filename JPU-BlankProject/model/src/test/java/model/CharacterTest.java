package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CharacterTest {
	private Character character;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.character = new Character(526, 123);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetPos_x() {
		Assert.assertEquals(526, this.character.getPos_x());
	}

	@Test
	public void testGetPos_y() {
		Assert.assertEquals(123, this.character.getPos_y());
	}

}
