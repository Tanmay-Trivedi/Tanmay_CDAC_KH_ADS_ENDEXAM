// Pattern Printing Program 9 - Assignment 3
 
         // 	 A
		//      A B  
		//     A B C
		//    A B C D
		//   A B C D E

class Pattern_9
{
	public static void main(String args[])
	{
		int i,j,k,l=5;
		System.out.println(" PATTERN Pyramid A AB ABC ABCD ABCDE ");
				
		for( i = 65; i<=70 ; i++ ) // For Loop for Rows
	 	{    
				for(k=70 ; k>i ; k--)
				{
					System.out.print(" ");
					
				}
				
				for(j=65 ; j<i ; j++ ) // For Loop for Column 
				{    
					System.out.print(" "+(char)j+" ");  
					
				}
		System.out.println();
		}
	}
}