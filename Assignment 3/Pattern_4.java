// Pattern printing program 4 - Assignment 3  
        // 1
		// 2 2
		// 3 3 3
		// 4 4 4 4
		// 5 5 5 5 5

class Pattern_4
{
	public static void main(String args[])
	{
		int i,j;
		System.out.println(" PATTERN INCREASING TRAINGLE VIA Printing \'I\' ");
		
		for( i = 1; i<=5; i++ ) // For Loop for Rows
		{
			for( j=1; j<=i ; j++ ) // For Loop for Column 
			{
				System.out.print(i+" "); 
			}
		System.out.println();
		}
	}
}