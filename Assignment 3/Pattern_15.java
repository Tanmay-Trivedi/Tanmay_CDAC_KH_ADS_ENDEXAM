// Pattern Printing Program 15 - Assignment 3
 
         // 	 5
		//       5  4 
		//       5  4  3
		//       5  4  3  2
		//       5  4  3  2  1

class Pattern_15
{
	public static void main(String args[])
	{
		int i,j,k,l=5;
		System.out.println(" PATTERN INCREASING TRIANGLE ");
				
		for( i = 1; i<=5; i++ ) // For Loop for Rows
	 	{    
				for( j=5; j>=i ; j-- ) // For Loop for Column 
				{    
					System.out.print("  "+j);  
					
				}
		System.out.println();
		}
	}
}