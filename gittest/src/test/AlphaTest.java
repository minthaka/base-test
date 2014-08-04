package test;

import static org.junit.Assert.*;
import gittest.Alpha;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AlphaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetName() {
		Alpha a=new Alpha();
		a.setName("Bela");
		assertEquals("The name got is Csaba", "Csaba", a.getName());
	}
	
	@Test
	public void testGetNameLenght() {
		Alpha a=new Alpha();
		a.setName("Csaba");
		assertEquals("Name is 5 characters long", 5, a.getNameLenght());
	}

}
