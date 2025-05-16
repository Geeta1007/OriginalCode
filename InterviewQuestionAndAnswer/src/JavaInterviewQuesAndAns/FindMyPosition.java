package JavaInterviewQuesAndAns;

import java.util.Scanner;

public class FindMyPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ASCII -> 97->a, 65->A
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please provide your character: ");
		char givenChar = scanner.next().charAt(0);
		givenChar=Character.toLowerCase(givenChar);
		
		int asciiValue =(int) givenChar;
		int position = asciiValue-96;
		System.out.println(position);
		
	}

}
