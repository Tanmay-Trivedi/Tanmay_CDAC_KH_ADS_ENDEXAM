// Star Type Pattern Printing Program Assignment - 3

	 //    * 
	//	  **
	//	 ***
	//	****
    // *****
	
class Pattern_2_2
{
	public static void main(String [] args )
	{
	  for(int i = 1 ; i <=5 ; i++)
	  {
		for(int k=5; k>i ; k--) 
			{
			System.out.print(" ");
			}
			for(int j=1 ; j<=i ; j++)
			{
			System.out.print("*");
			} 
		System.out.println();
	  }
	}
}