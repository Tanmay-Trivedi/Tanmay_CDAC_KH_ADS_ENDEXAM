// Pattern Printing Program 6 - Assignment 3
 
        //         *
		//       * *
		//     * * *
		//   * * * *
		// * * * * *

class Pattern_6
{
	public static void main(String args[])
	{
		int i,j,k;
		System.out.println(" PATTERN INCREASING TRAINGLE VIA Printing \'*\' With SpACES ");
		
		for( i = 1; i<=5; i++ ) // For Loop for Rows
		{	for( k = 5; k >= i; k-- )
			{
				System.out.print(" "); // For Loop for spaces 
				
			}
				for( j=1; j<=i ; j++ ) // For Loop for Column 
				{
					System.out.print(""); 
					System.out.print("*"); 
				}
		System.out.println();
		}
	}
}