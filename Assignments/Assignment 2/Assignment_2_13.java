// 13. Write a Java program to print the area and perimeter of a rectangle. 

import java.util.Scanner;

class Assignment_2_13
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter length (5.5) and breadth (8.5) of rectangle : ");
		
		float l = ob.nextFloat();
		float b = ob.nextFloat();
	
		float ar = l*b;
		System.out.println("Area of	rectangle is : "+ar);
		
		float pr = 2*(l+b);
		System.out.println("Perimeter of rectangle is : "+pr);
	}
}