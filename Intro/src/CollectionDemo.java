import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Find out unique number 
		int[] a = {4,5,5,5,5,4,8,8,4,5,4,8,6};
		//4-4, 5-5, 8-3, 6-1
		
		ArrayList<Integer> ab = new ArrayList<Integer>();
		
		for (int i=0;i<a.length;i++)
		{
			int k = 0;
			if(!ab.contains(a[i]))
			{
				ab.add(a[i]);
				k++;
				
				for( int j=i+1;j<a.length; j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				System.out.println(a[i]+ " - "+ k);
				if(k==1)
				{
					System.out.println(a[i]+ " is the unique number");
					System.out.println(ab);
				}
			}
			
			
		}
			
	
	}

}
