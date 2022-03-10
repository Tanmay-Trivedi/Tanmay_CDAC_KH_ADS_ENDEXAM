// Write a Java program that takes a number as input and prints its multiplication
// table upto 10. 

import java.util.Scanner ;

class Assignment_2_7
{
 public static void main(String args[])
 {
		 System.out.print("Enter the No-8 : ");
		 
		 Scanner ob = new Scanner(System.in);
		 int x = ob.nextInt();
		 
		 for(int i = 1; i<=10 ; i++)
		 {
			System.out.println("8 x "+i+" = "+(x*i));
		 }
 }		 
}		 