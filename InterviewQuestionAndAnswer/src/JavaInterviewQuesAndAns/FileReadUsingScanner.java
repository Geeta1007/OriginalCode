package JavaInterviewQuesAndAns;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileReadUsingScanner {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		String location = "UsingBufferedWriter.txt";

		Scanner scanner = new Scanner(new File(location));

		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
	}

}
