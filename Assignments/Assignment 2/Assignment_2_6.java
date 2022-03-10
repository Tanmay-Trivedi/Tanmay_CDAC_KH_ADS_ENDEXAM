//  Write a Java program to print the sum (addition), multiply, subtract, divide and
//  remainder of two numbers. 

import java.util.Scanner;

class Assignment_2_6
{
	public static void main(String args[])
		{ 
		 System.out.print("Enter the First No : ");
		 
		 Scanner sc = new Scanner(System.in);
		 int x = sc.nextInt();
		 
		 System.out.print("Enter the Second No : ");
		 
		 
		 int y = sc.nextInt();
		 
		 System.out.println(" 1.Sum 2.Multiply 3.Subtract 4.Divide 5.Remainder");
		// int ch = sc.nextInt();
		 
		 //if(ch==1)
			//{	
			 System.out.println("Sum is :"+(x+y));	
			//}
		 //else if(ch == 2) 
			//	{
					System.out.println("Multiply is :"+(x*y));
				//}
				//else if (ch==3)
					//{
						System.out.println("Subtract :"+(x-y));
					//}
					//else if(ch==4)
						//{
							System.out.println("Divide :"+(x/y));
						//}
						//else if(ch==5)
						//{ 
					      System.out.println("Remainder is : "+(x%y));
						//}
		}
}

