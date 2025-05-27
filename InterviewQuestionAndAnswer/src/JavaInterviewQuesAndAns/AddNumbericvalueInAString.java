package JavaInterviewQuesAndAns;

public class AddNumbericvalueInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Kishorek5umar23";
		
		int sum=0;
		
		for(int i=0; i<input.length(); i++)
		{
			char character = input.charAt(i);
			
			if(Character.isDigit(character))
			{
				sum=sum+Character.getNumericValue(character);
			}
		}
		System.out.println(sum);
	}

}
