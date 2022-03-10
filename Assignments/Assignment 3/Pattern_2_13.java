// Pattern Printing Program 13

/*
*****
 ****
  ***
   **
    *
   **
  ***
 ****
*****
*/


	class Pattern_2_13
	{
	public static void main(String args[])
	  {
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int a=1;a<=4;a++)
		{
			for(int c=a;c<=4;c++)
			{
				System.out.print(" ");
			}
			for(int b=0;b<=a;b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	  }
	}
