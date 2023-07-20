package mypack;


public class App 
{
	
	public static boolean isEqual(int a,int b)
	{
		return (a == b)? true : false;		
	}
	
		
    public static void main( String[] args )
    {
        System.out.println(App.isEqual(9,9));
        System.out.println(App.isEqual(-3,-3));
        System.out.println(App.isEqual(9,10));
        System.out.println(App.isEqual(3,4));
    }
}