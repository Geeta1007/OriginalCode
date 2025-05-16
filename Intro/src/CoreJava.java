
public class CoreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int MyNum = 6;
		double MyNum2 = 6.6e6;
		String name1 = "Java lecture";
		boolean value1 = false;
		char word1 = '\101';
		char word2 = '@';
		
		System.out.println(MyNum);
		System.out.println(name1+ " is the name of my current project");
		
//		Array----
		 
		int[] arry = new int[3];
		arry[0] = 10;
		arry[1] = 20;
		arry[2] = 30;
		
		int[] arry1 = {10,20,30};
		System.out.println(arry1[0]);
		
		double[] arry2 = {10,20.3,30};
		System.out.println(arry2[1]);
		
		
//		for loop---
		for (int i = 0; i<arry.length; i++)
		{
			
			System.out.println(arry[i]);
			
		}

		String[] story = {"kayal","mayu","viyu"};
		for (int i =0; i<story.length; i++)
		{
			System.out.println(story[i]);
		}
		
		for (String kyu: story)
		{
			System.out.println(kyu);
		}
		
		
		
	
		
		
	}

}
