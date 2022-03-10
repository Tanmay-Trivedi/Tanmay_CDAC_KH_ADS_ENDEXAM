// Pattern Printing Program 12 

            // 	 1
		   //   2 2  
		  //   3 3 3
		 //   4 4 4 4
		//   5 5 5 5 5
		
class Pattern_12
{
	public static void main(String [] args )
	{
		for(int i =1 ; i <=5 ; i++) // For loop => Rows
		{
			for(int k=5 ; k>i ; k--) // For loop => Spaces
			{
				System.out.print(" ");
			}
			
			 for(int j=1; j<=i ; j++ ) // For loop => Column
			 {
			  System.out.print(" "+i);
			 }
		System.out.println();
		}
	
	}

}		