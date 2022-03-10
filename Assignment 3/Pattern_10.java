// Pattern Printing Program 9 - Assignment 3
 
         // 	 E
		//      D E  
		//     C D E
		//    B C D E
		//   A B C D E

class Pattern_10
{
	public static void main(String args[])
	{
		int i,j,k,l=5;
		System.out.println(" PATTERN Pyramid E DE CDE BCDE ABCDE ");
				
		for( i = 70; i>=65 ; i-- ) // For Loop for Rows
	 	{    
				for(k=65 ; k<i ; k++)
				{
					System.out.print(" ");
					
				}
				
				for(j=i ; j<70 ; j++ ) // For Loop for Column 
				{    
					System.out.print(" "+(char)j);  
					
				}
		System.out.println();
		}
	}
}