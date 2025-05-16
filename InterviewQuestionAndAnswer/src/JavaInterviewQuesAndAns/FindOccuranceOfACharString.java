package JavaInterviewQuesAndAns;

public class FindOccuranceOfACharString {

	String input = "Kishorekumarkishk";
	char toFind = 'k';
	int occurance = 0;
	int occurance1=0;

	public void usingForEach() {
		
		input = input.toLowerCase();
		
		char[] array = input.toCharArray();

		for (char c : array) {
			if (c == toFind) {
				occurance++;
			}
		}
		System.out.println(occurance);
	}

	public void usingForLoop() {

		input = input.toLowerCase();

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == toFind) {
				occurance1++;
			}
		}
		System.out.println(occurance1);
	}
	
	public void withoutUsingIteration()
	{
		input=input.toUpperCase();
		String charToFind = Character.toString(toFind).toUpperCase();
		
		int actualLength = input.length();
		
		int lengthAfterReplacement = input.replace(charToFind, "").length();
		
		int output =  actualLength - lengthAfterReplacement;
		System.out.println(output);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindOccuranceOfACharString string = new FindOccuranceOfACharString();
		string.usingForEach();
		string.usingForLoop();
		string.withoutUsingIteration();

	}
}
