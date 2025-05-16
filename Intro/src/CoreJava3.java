
public class CoreJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String is an object that represents sequence of characters
//		type 1 --- String literal--------------------------------------------------------------
//		String s = "welcome to the selenium class";
		String s1 = "welcome to the selenium class";
		
//		type 2 --- using new memory allocate operator-------------------------------------------------------------
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
//		converting string into array using split-----------------------------------------------------
		String s = "welcome to the selenium class";
		String[] z = s.split("the");
		System.out.println(z[0]);
		System.out.println(z[1]);
		System.out.println(z[1].trim());

//		for (int j=0; j<s.length(); j++)
//		{
//			System.out.println(s.charAt(j));
//		}

		for (int j=s.length()-1; j>=0; j--)
		{
			System.out.println(s.charAt(j));
		} 
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
