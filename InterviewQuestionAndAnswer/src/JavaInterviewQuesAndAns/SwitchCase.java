package JavaInterviewQuesAndAns;

public class SwitchCase {

	String hero = "Captain America";
	
	public void heroOrNot() {
		switch (hero) {
		case "Super man":
			System.out.println("Super man is a super hero");
			break;
		case "Captain America":
			System.out.println("Captain America is a super hero");
			break;
		case "Bat man":
			System.out.println("Bat man is a super hero");
			break;
		default:
			System.out.println(hero+" sorry I dont know about this person");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwitchCase switchCase = new SwitchCase();
		switchCase.heroOrNot();
		
	}

}
