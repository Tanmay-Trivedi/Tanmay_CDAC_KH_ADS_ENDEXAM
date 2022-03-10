// Pattern printing program 5 - Assignment 3  
        // A
		// B B
		// C C C
		// D D D D
		// E E E E E

class Pattern_5
{
	public static void main(String args[])
	{
		int i,j,k;
		
		System.out.println(" PATTERN INCREASING TRAINGLE VIA Printing A BB CCC DDDD EEEEE ");
		
		for( i = 65; i<=65+4; i++ ) // For Loop for Rows
		{
			for( j=65; j<=i ; j++ ) // For Loop for Column 
			{
				System.out.print((char)i+" "); 
			}
		System.out.println();
		}
	}
}