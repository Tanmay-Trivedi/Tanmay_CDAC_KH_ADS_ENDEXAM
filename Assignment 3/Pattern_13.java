// Pattern Printing Program 13 

            // 	 A
		   //   B B  
		  //   C C C
		 //   D D D D
		//   E E E E E
		
class Pattern_13
{
	public static void main(String [] args )
	{
		for(int i =65 ; i<70 ; i++) // For loop => Rows
		{
			for(int k=70 ; k>i ; k--) // For loop => Spaces
			{
				System.out.print(" ");
			}
			
			 for(int j=65; j<=i ; j++ ) // For loop => Column
			 {
			  System.out.print(" "+(char)i);
			 }
		System.out.println();
		}
	
	}

}		