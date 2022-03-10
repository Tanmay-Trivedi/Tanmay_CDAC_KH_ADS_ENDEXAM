// Pattern printing program 1 - Assignment 3  
        // 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		// 1 2 3 4 5

class Pattern_1
{
	public static void main(String args[])
	{
		int i,j,k;
		System.out.println(" PATTERN INCREASING TRAINGLE VIA Printing \'J\' ");
		
		for( i = 1; i<=5; i++ ) // For Loop for Rows
		{
			for( j=1; j<=i ; j++ ) // For Loop for Column 
			{
				System.out.print(j+" "); 
			}
		System.out.println();
		}
	}
}