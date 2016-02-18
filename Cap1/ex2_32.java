package Cap1;

import java.util.Scanner;

public class ex2_32 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n1, n2, n3, n4, n5;
		int p, n, z;
		p = 0;
		n = 0;
		z = 0;
		
		System.out.print("Insert the first number: ");
		n1 = input.nextInt();
		
		System.out.print("Insert the second number: ");
		n2 = input.nextInt();
		
		System.out.print("Insert the third number: ");
		n3 = input.nextInt();
		
		System.out.print("Insert the fourth number: ");
		n4 = input.nextInt();
		
		System.out.print("Insert the fifth number: ");
		n5 = input.nextInt();
		
		if(n1<0)
		{
			n = n + 1;
		}
		if(n2<0)
		{
			n = n + 1;
		}
		if(n3<0)
		{
			n = n + 1;
		}
		if(n4<0)
		{
			n = n + 1;
		}
		if(n5<0)
		{
			n = n + 1;
		}
		if(n1>0)
		{
			p = p + 1;
		}
		if(n2>0)
		{
			p = p + 1;
		}
		if(n3>0)
		{
			p = p + 1;
		}
		if(n4>0)
		{
			p = p + 1;
		}
		if(n5>0)
		{
			p = p + 1;
		}
		if(n1==0)
		{
			z = z + 1;
		}
		if(n2==0)
		{
			z = z + 1;
		}
		if(n3==0)
		{
			z = z + 1;
		}
		if(n4==0)
		{
			z = z + 1;
		}
		if(n5==0)
		{
			z = z + 1;
		}
		
		System.out.printf("The number of positive numbers is %d%nThe number of negative numbers is %d%nThe number of zeroes is %d%n", p, n, z);
		
	}
}
