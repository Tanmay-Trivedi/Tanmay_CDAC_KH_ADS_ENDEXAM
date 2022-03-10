// Pattern Printing Program 11 - Assignment 3
 
         // 	 *
		//      ***  
		//     *****
		//    *******
		//   *********

class Pattern_11
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
					if(j==1)
					 System.out.print("*"); // if for printing 1 * in row 1 
					else System.out.print("**"); // else print 1 extra *
				}
		//System.out.print(" *");		
		System.out.println();
		}
	}
}