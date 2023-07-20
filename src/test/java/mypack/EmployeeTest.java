package mypack;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	Employee E ;
	Object arr[];
	
	public EmployeeTest()
	{
		E = new Employee();
		arr = new Object[5];
	}
	
	
	@Before
	public void init()
	{
		arr[0] = new Employee(101,"Aman");
		arr[1] = new Employee(102,"Anil");
		arr[2] = new Employee(103,"Rahul");
		arr[3] = new Employee(104,"Vijay");
		arr[4] = new Employee(105,"Piyush");
		System.out.println("Call before the test case ....");
		
	}
	
		
	@Test 
	public void testCase1() 
	{
		
		Object ep[] = E.getRecords().toArray();
		assertArrayEquals(arr,ep);  // (required output , output))
		System.out.println("Running the test case");		
		
	}

	
	@After
	public void complete()
	{
		System.out.println("Testing is completed....");
	}
	
}