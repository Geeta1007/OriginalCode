
public class StaticVar {
	
	String name; // Instance variables. 
	
	// They are defined inside the constructor function using the 'this' keyword. 
	// These Instance variables are tied up to the object. It will keep on get changed when we create new objects
	
	String address; // Instance variables
	static String city; // Class variables// all static variables are class variables// all objects will refer this for city variable
	static int i;
	
	static // static block used to initialize all static variables
	{
		city = "Chennai";
		i = 0;
	}
	
//	public void getaddress()
//	{
//		System.out.println(address+ " " + city);
//	}
	
	StaticVar(String name, String address) 
	// these 3 variables are local variables.coz the scope of these variables are inside block only
	// assigning local variables to instance variables using this keyword
	// constructor will automatically executed when we created an object, no need to call any method to print output
	{
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
		System.out.println(address+ " " + city);
	}
	
	public static void getcity() // static method will only accept static variable
	{
		System.out.println(city+ " "+i);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVar sv = new StaticVar("Raj", "Guindy");
		StaticVar sv1 = new StaticVar("Dev", "Porur");
		StaticVar sv2 = new StaticVar("Mona", "Chrompet");
//		sv.getaddress();
//		sv1.getaddress();
		sv2.getcity(); // wrong way of calling
		StaticVar.getcity(); // static method getcity() from the type StaticVar should be accessed in a static way
		StaticVar.i=8;
		
		
		
		
	}

}
