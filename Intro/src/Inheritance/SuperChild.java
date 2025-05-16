package Inheritance;

public class SuperChild extends SuperParent{

	String name = "Child";
	
	//If the parent class does not have a no-argument constructor and only has parameterized constructors, 
	//you must explicitly use the super(parameters...) call in the child class to invoke the desired constructor.
	//Without this, the code will fail to compile.
	public SuperChild()
	{
		super("I am a super keyword of ");
		System.out.println("Child class constructor");
	}
	public void getData()
	{
		super.getData();
		System.out.println("I am a Child");
	}
	public void name()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		SuperChild sc = new SuperChild();
		sc.name();
		sc.getData();
	}

}
