package com.lti.demos;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


class Testcaseex {

/*@Test
	void test() {
		fail("Not yet implemented");
	}

}*/
	@Test
	@Disabled
	
public void testcaseex() 
{
	Assertions.assertEquals("Hello","Hello");
	Assertions.assertEquals(500,200+300);
}
	@Test void testadd() 
	{
		calc c =new calc();
		int r =c.add(300,200);
		Assertions.assertEquals(500,r);
	}
	@Test
	void testAssertFalse() {

	Assertions.assertFalse("FirstName".length() == 10);
	Assertions.assertFalse(10 > 20, "assertion message");

	

	
}
	
	@Test
	public void testEmptyArrayList() {
	ArrayList<Integer> al = new ArrayList<Integer>();
	Assertions.assertEquals(0, al.size());
	Assertions.assertTrue(al.isEmpty()); // assertTrue Method
	// assertFalse(al.isEmpty());
	}

	
	@Disabled
	@Test
	void testAssertNull() {
	String str1 = null;
	String str2 = "abc";
	Assertions.assertNull(str1);
	Assertions.assertNotNull(str2); }


}