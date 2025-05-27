package JavaInterviewQuesAndAns;

public class Dummy {
	public static void main(String[] args) {
		int number = 1234; // you can change this to any number
		int reversed = 0;

		while (number != 0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number = number / 10;
		}

		System.out.println("Reversed number: " + reversed);
	}
}
