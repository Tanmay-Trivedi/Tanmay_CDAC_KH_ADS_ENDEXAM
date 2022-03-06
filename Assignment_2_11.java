// 11. Write a Java program to print the area and perimeter of a circle. 


class Assignment_2_11
{
	public static void main(String args[])
	{
		final double pi = 3.1415;
		double ar,pr,r=7.5;
		pr = 2*pi*r;
		System.out.println("Perimeter of circle with radius 7.5 is : "+pr);
		
		ar=pi*r*r;
		System.out.println("Area of circle with radius 7.5 is : "+ar);
	}
}