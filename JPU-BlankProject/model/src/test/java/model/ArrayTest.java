package model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayTest {
	Array array;
	ArrayList<Test> test;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.array = new Array();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
	    Assert.assertEquals(test, array);  
	}

}
