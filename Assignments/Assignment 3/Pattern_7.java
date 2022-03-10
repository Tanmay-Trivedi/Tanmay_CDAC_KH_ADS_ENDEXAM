// Pattern Printing Program 7 - Assignment 3
 
         // 	 1
		//      1 2  
		//     1 2 3
		//    1 2 3 4
		//   1 2 3 4 5

class Pattern_7
{
	public static void main(String args[])
	{
		int i,j,k;
		System.out.println(" PATTERN Pyramid 1 12 123 1234 12345 ");
		
		for( i = 1; i<=5; i++ ) // For Loop for Rows
		{
			for( k = 5 ; k >= i; k--) // For loop for Spaces
			{
				System.out.print(" ");
				
			}	
				for( j=1; j<=i ; j++ ) // For Loop for Column 
				{
					System.out.print(""+j+"  "); // Similar to previous program except space 
				}
		System.out.println();
		}
	}
}