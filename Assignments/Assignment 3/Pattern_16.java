// Pattern Printing Program 16 - Assignment 3
 
         // 	 5
		//       5  4 
		//       5  4  3
		//       5  4  3  2
		//       5  4  3  2  1

class Pattern_16
{
	public static void main(String args[])
	{
		int i,j,k,l=5;
		System.out.println(" PATTERN INCREASING TRIANGLE ");
				
		for( i = 5; i>=1; i--) // For Loop for Rows
	 	{    
				for( j=5; j>=i ; j-- ) // For Loop for Column 
				{    
					System.out.print("  "+j);  
					
				}
		System.out.println();
		}
	}
}