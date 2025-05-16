import java.lang.reflect.Field;

public class ExceptionDemo {

//	int a = 4;
//	int b = 0;
//	
//	int c = a/b;
//	
//	public void getthat()
//	{
//		System.out.println(c);
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ExceptionDemo ED = new ExceptionDemo();
		//ED.getthat();
		//final int abc =4;
		int a = 4;
		int b = 0;
		
		try
		{
			int c = a/b;
			System.out.println(c);
			
//			int ab[] = new int[5];
//			System.out.println(ab[7]);
			
					
		}
		
		catch(IndexOutOfBoundsException io)
		{
			System.out.println("Oops! Its an IndexBound error");
		}
		
		
		catch(ArithmeticException ae)
		{
			System.out.println("Oops! Its an Arithmetic error");
		}
		
		
		catch(Exception e)
		{
			System.out.println("Oops! Its an error");
			int c = a+b;
			System.out.println("Try instead addition and it is "+ c);
		}
		finally
		{
			System.out.println("Delete cookies");
		}
		
		
	}

}
