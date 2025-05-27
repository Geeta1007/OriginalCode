package JavaInterviewQuesAndAns;

public class SuperKeywordExample extends ParameterizedConstructor{

	SuperKeywordExample(){
		super("Mammal", "monotremes");
		System.out.println("This is child class");
	}

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			ParameterizedConstructor constructor = new SuperKeywordExample();
			constructor.sayAboutAnimal();
		
		}

	}
