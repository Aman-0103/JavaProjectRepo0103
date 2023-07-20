package mypack;

public class StringExample {
	
	public String greet(String name) {
		
		return "Good Morning ! " + name;
		
	}

	public static void main(String[] args) {
		
		StringExample obj = new StringExample();
		
		System.out.println(obj.greet("   Aman   "));
		System.out.println(obj.greet("Anil"));
		System.out.println(obj.greet("Vijay"));
		System.out.println(obj.greet("   Rahul   "));
		
	}

}
