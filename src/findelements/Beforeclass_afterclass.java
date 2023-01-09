package findelements;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Beforeclass_afterclass {

	@Before
	public void setUp() throws Exception {
		System.out.println("test precondition");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("test procondition");
	}

	@Test
	public void test()
	{
		
		System.out.println("test excecuted");
	}

}
