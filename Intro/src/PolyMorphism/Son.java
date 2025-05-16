package PolyMorphism;

public class Son extends Parents {

	/*
	 * This class is illustrate method overloading 
	 * with a practical example
	 * 
	 */
	
	@Override
	public void Marrige() {
		System.out.println("No daddy! My Marriage my rules");
	}
	
	public static void main(String[] args) {
		
		
		Parents parents = new Son();
		parents.properties();
		parents.Marrige();
		
		
	}
	
	
}
