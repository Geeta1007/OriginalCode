package Inheritance;


public class ChildInheritClass extends ParentInheritClass {

	String color = "Child Sky blue";
	public void engine()
	{
		System.out.println("Engine system is ready to implement");
	}
	public void gear()
	{
		System.out.println("oopps");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildInheritClass ci = new ChildInheritClass();
		ParentInheritClass pi = new ChildInheritClass();
		ParentInheritClass ppi = new ParentInheritClass();
		
		ci.engine();
		ci.brake();
		ci.color();
		ci.gear();
		pi.gear();
		pi.color();
		ppi.color();
		
		
	}
	public void color() {

		System.out.println(color);
	}
// using SUPER keyword------------when using super, it invokes parent class constructor. it will work only when parent class inherited-----------------------
//	public void color() {
//
//		System.out.println(super.color);
//	}

}
