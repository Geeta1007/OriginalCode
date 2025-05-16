package JavaInterviewQuesAndAns;

public class FindLargestAndSmallestWordInASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Upper & lower Case conversion without123405 using built in methods";
		
		String[] splitted = input.split(" ");
		
		String smallestWord = splitted[0];
		String largestWord = splitted[0];
		
		for (String word : splitted) {
			word = word.replaceAll("[^a-zA-Z0-9]", "");
			
			if(word.isEmpty()) continue;
					
			if(word.length()<smallestWord.length())
			{
				smallestWord = word;
			}
			if(word.length()>largestWord.length())
			{
				largestWord = word;
			}
		}
		
		System.out.println("Smallest word is: "+smallestWord);
		System.out.println("Largest word is: "+largestWord);
		
		
	}

}
