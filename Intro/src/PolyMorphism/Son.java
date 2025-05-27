package PolyMorphism;

public class Son extends Parents {

	/*
	 * This class is illustrate method overloading & overriding
	 * with a practical example
	 * 
	 */
	
	@Override
	public void Marrige() {
		System.out.println("No daddy! My Marriage my rules");
	}
	
	@Override
	public int addition(int c, int d) {
		return c-d;
	}
	
	public static void main(String[] args) {
		
		
		Parents parents = new Son();
		Parents parents2 = new Parents();
		parents.properties();
		parents.Marrige();
		parents2.Marrige();
		System.out.println(parents.addition(10, 2));
	
		
	}
	
	
}
