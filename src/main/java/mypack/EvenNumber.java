package mypack;

public class EvenNumber {
	
	public boolean isEven(int a) {
		
		return a % 2 == 0 ? true : false;
	}

	public static void main(String[] args) {
		
		EvenNumber obj = new EvenNumber();
		
		System.out.println(obj.isEven(90));
		System.out.println(obj.isEven(97));
		System.out.println(obj.isEven(-96));

	}

}
