import java.util.Scanner;

class Assignment_2_5
{
	public static void main(String args[])
		{ 
		 System.out.print(" Enter 1st No : ");
		 
		 Scanner sc = new Scanner(System.in); // Creating object 
		 int n1 = sc.nextInt();
		 
		 System.out.print(" Enter 2nd No : ");
		 int n2 = sc.nextInt();
		 
		 float p = n1*n2 ;
		 
		 System.out.println("Product of :"+n1+" and "+n2+" is "+p);
		
		}
}