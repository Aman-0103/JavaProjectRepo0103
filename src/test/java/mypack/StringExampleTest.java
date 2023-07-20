package mypack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.hamcrest.core.Is;

import org.junit.Test;

public class StringExampleTest {

	StringExample ob;
	
	public StringExampleTest() {
		
		ob = new StringExample();
	}
	
	@Test
	public void testCase1() {
		
		//assertThat(result value, expected value) works on the patterns
		assertThat(ob.greet("   Aman   "), is("Good Morning ! Aman"));
		
	}
	
	@Test
	public void testCase2() {
		
		//assertThat(result value, expected value) works on the patterns
		assertThat(ob.greet("Anil"), is("Good Morning ! Anil"));
		
	}
	
	@Test
	public void testCase3() {
		
		//assertThat(result value, expected value) works on the patterns
		assertThat(ob.greet("Vijay"), is("Good Morning ! Vijay"));
		
	}
	
	@Test
	public void testCase4() {
		
		//assertThat(result value, expected value) works on the patterns
		assertThat(ob.greet("   Rahul   "), is("Good Morning ! Rahul"));
		
	}

}
