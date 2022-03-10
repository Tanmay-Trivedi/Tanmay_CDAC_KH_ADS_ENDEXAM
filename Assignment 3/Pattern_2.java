// Pattern printing program 1 - Assignment 3  
        // A
		// A B
		// A B C
		// A B C D
		// A B C D E

class Pattern_2
{
	public static void main(String args[])
	{
		int i,j,k;
		
		System.out.println(" PATTERN INCREASING TRAINGLE VIA Printing A B C D E ");
		
		for( i = 65; i<=65+5; i++ ) // For Loop for Rows
		{
			for( j=65; j<=i ; j++ ) // For Loop for Column 
			{
				System.out.print((char)j+" "); 
			}
		System.out.println();
		}
		System.out.print("CHARACTER TO ASCII \'A\' : "); // LEarn This 
		char ch = 'a';
		System.out.println((int)ch);
	}
}