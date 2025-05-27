package JavaInterviewQuesAndAns;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteUsingFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location="UsingFileWriter.txt";
		String content="Dhoni is always cool";
		
		FileWriter fileWriter = new FileWriter(location);
		fileWriter.write(content);
		fileWriter.close();
		
	}

}
