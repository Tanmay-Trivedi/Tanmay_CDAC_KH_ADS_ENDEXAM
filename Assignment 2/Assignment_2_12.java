// 12. Write a Java program that takes three numbers as input to calculate and print the
// average of the numbers. 

// Using Command Line Argument
class Assignment_2_12
{
	public static void main(String args[])
	{
		System.out.println("Enter three numbers  : ");
		
		String s1 = args[0];
		String s2 = args[1];
		String s3 = args[2];
		
		float x = Float.parseFloat(s1);
		float y = Float.parseFloat(s2);
		float z = Float.parseFloat(s3);
		
		float av = (x+y+z)/3;
		
		System.out.println("Average of three numbers is : "+av);
	
	}
}