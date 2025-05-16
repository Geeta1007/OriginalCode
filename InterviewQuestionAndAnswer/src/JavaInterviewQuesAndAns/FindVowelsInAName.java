package JavaInterviewQuesAndAns;

public class FindVowelsInAName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Kishorekumar a";
		int vowelCount = 0;
		input=input.toLowerCase();
		
		for(int i=0; i<input.length(); i++)
		{
			if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o'|| input.charAt(i)=='u')
			{
				vowelCount++;
			}
		}
		System.out.println(vowelCount);
		
	}

}
