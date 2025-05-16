
public class ConstructorDemo {

	int a =100;
	//Default constructor
	public ConstructorDemo()
	{
		System.out.println("I am a constructor");
	}
	
	//Parameterized constructor
	public ConstructorDemo(int a, int b)
	{
		System.out.println("I am a parameterized constructor");
		int c =a+b;
		int d =this.a+b;
		System.out.println(c);
		System.out.println(d);
	}
	
	public ConstructorDemo(String str)
	{
		System.out.println(str);
	}
	public void getdata()
	{
		System.out.println("I am a method");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd1 = new ConstructorDemo(10,45);
		ConstructorDemo cd2 = new ConstructorDemo("welcome");
	}

}
