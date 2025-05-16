import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,5,4,9,3,45,65,85,58,98,22,64};
		
		
//		Find all the values of multiple of 2----------------------------------------------------
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] % 2 ==0)
			{
				System.out.println(arr[i]);
			}
			else
			{
				System.out.println(arr[i]+" is not multiple of 2");
			}
		}
		
//		check if the array has multiple of 2 ---------------------------------------------------------
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] % 2 ==0)
			{
				System.out.println("Yes, this array has multiple of 2");
				break;
			}
			
		}
		
		
//		Course exercise--------------------------------------------------------------------------
		int[] test = {10, 20, 30, 40, 50};
		System.out.println(test[0]);
		int count = test.length;
		int output = count-1;
		System.out.println(test[output]);
//		System.out.println(test[test.length-1]);

		 for (int i=test.length-1; i>=0; i--)
		 {
		     System.out.println(test[i]);
		 }

		 int sum=0;
//		 for (int i =0; i<test.length; i++)
//		 {
//			 sum+=test[i];
//			 
//		 }
//		 
//		 System.out.println(sum);

//	OR
//		
		for (int op:test)
		{
			sum+=op;
			
		}
		System.out.println(sum);
		
		
//		ArrayList---------------------------------------------------------------------------------
		
		ArrayList<String> z = new ArrayList<String>();
		z.add("Geetha");
		z.add("kishore");
		z.add("Viyan");
		z.add("Temp");
		z.add("Hridayam");
		
//		z.remove(2);
//		z.clear();
		z.isEmpty();
		System.out.println(z.get(2));
		System.out.println(z.isEmpty());
		System.out.println("***********************************************");
		System.out.println(z.contains("Gee"));
		System.out.println(z);
		z.add(0, "Initial");
		System.out.println(z);
		z.add(6, "viyu");
		System.out.println(z);
		z.remove(0);
		z.remove("Temp");
		System.out.println(z);
		System.out.println(z.indexOf("Geetha"));
		System.out.println(z.get(0));
		System.out.println(z.size());
		z.add("Geetha");
		System.out.println(z);
		
		for (int i=0; i<z.size(); i++)
		{
			System.out.println(z.get(i));
		}
			
		for (String val:z)
		{
			System.out.println(val);
		}
			
		System.out.println(z.contains("Viyan"));
		System.out.println("***********************************************");
		
		//converting static into dynamic---------------------------------------------------
		String[] story = {"kayal","mayu","viyu"};
		List<String> CnvtArray = Arrays.asList(story);   //***
		System.out.println(CnvtArray.contains("viyu"));
		
		System.out.println("*********************************************");
			
	System.out.println("-----------------------------------------------------------------------------------");
	
	ArrayList<String> q = new ArrayList<String>();
	q.add("apple");
	q.add("banana");
	q.add("cherry");
	q.add("mango");
	q.add("apple");
	
	System.out.println(q);
	
	q.remove(0);
	System.out.println(q);
	if (q.contains("orange"))
	{
		System.out.println("Orange is found in the list");	
	}
	else
	{
		System.out.println("Orange is not found in the list");	
	}
			
	
	System.out.println(q.size());
	
	String aa;
	for (int i=0; i<q.size(); i++)	
	{
		aa = q.get(i);
		System.out.print(q.get(i));
		System.out.println(q.indexOf(aa));
		//System.out.println(i + q.get(i));
	}
	
	
	
	}
		
	}


