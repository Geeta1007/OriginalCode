
public class methodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodsDemo demo = new methodsDemo();
		demo.getData();
		String output = demo.getData1();
		System.out.println(output);
		getData2();
		
		methodsDemo2 demo2 = new methodsDemo2();
		demo2.getData3();
	}

	public void getData()
	{
		System.out.println("Selenium lecture");
		
	}
	public String getData1()
	{
		System.out.println("Selenium lecture2");
		return "thank you";
	}
	
//	if we use static we can access the method from class level itself not object level---------------------------------------------------
	public static String getData2()
	{
		System.out.println("Selenium lecture3");
		return "thank you";
	}
	
	
	
	
	
	
	
}
