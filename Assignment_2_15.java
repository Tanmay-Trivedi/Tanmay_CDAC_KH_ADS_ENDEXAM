// 15. Write a Java program to swap two variables. 

import java.util.Scanner ;

class Assignment_2_15
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter two No for swapping : ");
		
		int n1 = ob.nextInt();
		int n2 = ob.nextInt();
		System.out.println("Swapping without using third variable :) ");
			n1=n1+n2;
			n2=n1-n2;
			n1=n1-n2;
		System.out.println(" After swapping \n n1 = "+n1+ " \n n2 = "+n2);
	
	}
}