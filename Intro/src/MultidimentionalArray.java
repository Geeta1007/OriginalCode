
public class MultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[][] = new int[2][3];
		a[0][0] = 5;
		a[0][1] = 8;
		a[0][2] = 1;
		a[1][0] = 4;
		a[1][1] = 2;
		a[1][2] = 6;
		
		//System.out.println(a[0][1]);
		
		int b[][] = {{5,7,1},{4,2,6}};
		int row, col;
		for (row =0; row<2; row++)
		{
			for (col =0; col<3; col++)
			{
				System.out.print(b[row][col]);
				System.out.print('\t');
			}
			System.out.println("");
		} 
		
		
// Print minimum number from the below matrix------------------------------------------------------------------------------------------
		
//		int QA[][] =  {{8,5,1},{9,4,3},{4,1,-7}};
//		int min=QA[0][0]; //-------------------------OR int min=0;
//		for (int i=0; i<3; i++)
//		{
//			for (int j=0; j<3; j++)
//			{
//				if (QA[i][j]<min)
//				{
//					min=QA[i][j];
//					
//				}
//			} 
//			
//		}
//		
//		System.out.println(min +" is the smallest number");
		
		
// Print maximum number from the below matrix------------------------------------------------------------------------------------------
		
				int QAS[][] =  {{8,5,1},{9999,4,3},{4,1,-7}};
				int max=QAS[0][0]; //-------------------------OR int min=0;
				for (int y=0; y<3; y++)
				{
					for (int z=0; z<3; z++)
					{
						if (QAS[y][z]>max)
						{
							max=QAS[y][z];
							
						}
					} 
					
				}
				
				System.out.println(max +" is the highest number");
		
//-----------------------------------------------------------------------------------------------------		
//find the maximum number of a column of minimum number
				
				int QA[][] =  {{8,5,1},{9,4,3},{4,1,-7}};
				int min=QA[0][0]; //-------------------------OR int min=0;
				int mincol=0;
				for (int i=0; i<3; i++)
				{
					for (int j=0; j<3; j++)
					{
						if (QA[i][j]<=min)
						{
							min=QA[i][j];
							mincol=j; //2
							
						}
					} 
					
				}
				
				System.out.println(min +" is the smallest number in column " + mincol);

				int k=0;
				int maxi =QA[0][mincol];// 1
				while(k<3)
				{
					if (QA[k][mincol]>=maxi)
					{
						maxi=QA[k][mincol];		
					}
					k++;
				}
				System.out.println(maxi +" is the highest number in smallest number of column");
				System.out.println("-----------------------------------------------------------------------------------------------------");	

				int MN[][] = {	{2,6,3},
								{2,0,7},
								{5,9,1}};
				
				int maxii = MN[0][0];
				int maxiicol =0;
				for (int r=0; r<3; r++)
				{
					for (int t=0; t<3; t++)
					{
						if (maxii<=MN[r][t])
						{
							maxii = MN[r][t];
							maxiicol = t;
						}	
					}
				}
		
				System.out.println(maxii + " is the maximum number in the column " + maxiicol);
		
				int tl=0;
				int mininum=0;
				for (int rl=0; rl<3; rl++)
				{
					while(tl==maxiicol)
					{
						if  (mininum<=MN[rl][tl])
						{
						mininum=MN[rl][tl];
						}
					}
					tl++;
				}
				
				System.out.println(mininum +" is the lowest number in hightest number of column");
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		
		
	}
	
	

}
