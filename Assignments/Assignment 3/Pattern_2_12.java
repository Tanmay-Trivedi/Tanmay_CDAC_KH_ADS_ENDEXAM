// Pattern Printing Program using 2 triangles 

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

class Pattern_2_12
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a=1;a<=4;a++)
		{
			for(int b=0;b<=a;b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
