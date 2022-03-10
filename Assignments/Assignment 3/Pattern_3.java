// Pattern Printing Program 3 - Assignment 3
 
        // *
		// * *
		// * * *
		// * * * *
		// * * * * *

class Pattern_3
{
	public static void main(String args[])
	{
		int i,j,k;
		System.out.println(" PATTERN INCREASING TRAINGLE VIA Printing \'*\' ");
		
		for( i = 1; i<=5; i++ ) // For Loop for Rows
		{
			for( j=1; j<=i ; j++ ) // For Loop for Column 
			{
				System.out.print(" * "); 
			}
		System.out.println();
		}
	}
}