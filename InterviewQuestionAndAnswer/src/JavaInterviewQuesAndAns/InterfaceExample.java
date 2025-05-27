package JavaInterviewQuesAndAns;

public interface InterfaceExample {

	public static final String name = "Gee"; //only public static final constants allowed
	
	default void method1() {
		
	}
	
	static void method2() {
		
	}
	
	void method3(); // or below--both are same
	
	 abstract void method4();
}
