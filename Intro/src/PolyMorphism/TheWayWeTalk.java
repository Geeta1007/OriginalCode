package PolyMorphism;

public class TheWayWeTalk {

	
	public void talk(Parents sytleOfTalking) {

		System.out.println("Respectful, cz its parents");
	}

	public void talk(Partner sytleOfTalking) {
		
		System.out.println("Loving, cz its partner");
	}

	public void talk(Boss sytleOfTalking) {
		
		System.out.println("Nothing personal, cz its boss");

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TheWayWeTalk talk = new TheWayWeTalk();
		
		Parents parents =  new Parents();
		talk.talk(parents);
		
		
		
		
		
		
		
		
		
		
	}

}
