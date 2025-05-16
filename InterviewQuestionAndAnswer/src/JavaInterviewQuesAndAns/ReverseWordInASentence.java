package JavaInterviewQuesAndAns;

public class ReverseWordInASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given = "Viyan is a gifted baby";
		String reversed="";
		
		String[] temp = given.split(" ");
		System.out.println(temp.length);
		
		for(int i =temp.length-1; i>=0; i--)
		{
			reversed = reversed+" "+temp[i];
		}
		System.out.println(reversed);
	}

}
