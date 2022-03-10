// Pattern Printing Program 17 - Assignment 3
 
         // 	 1
		//       2 3 
		//       4 5 6
		//       7 8 9 10
		//       11 12 13 14 15

class Pattern_17
{
	public static void main(String args[])
	{
		int i,j,k;
		System.out.println(" PATTERN INCREASING TRIANGLE ");
		int sum = 1; 
		
		for( i = 1 ; i<=5; i++) // For Loop for Rows
	 	{    
				for( j=1; j<=i ; j++ ) // For Loop for Column 
				{   
					
					System.out.print(" "+sum);  
					sum++;
				}
		System.out.println();
		}
	}
}