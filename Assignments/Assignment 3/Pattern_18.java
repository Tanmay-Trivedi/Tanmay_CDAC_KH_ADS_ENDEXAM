// Pattern Printing Program 18
 
	//  A B C D E	
	//  A B C D
	//  A B C
	//  A B
	//  A
	
 class Pattern_18
 {
	public static void main(String [] args )
	{
	
		for(int i =5 ; i >=1 ; i-- ) // Row 
		{
	      for(int j =i ; j>=1 ; j--) // Column 
			{
			  System.out.print(" "+(char)(70-j)); // int to char 
 			}
		System.out.println();	
		}
		
	}
 }