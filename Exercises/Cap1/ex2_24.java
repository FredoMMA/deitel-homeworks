/* (Largest and Smallest Integers) Write an application that reads five integers and determines
 * and prints the largest and smallest integers in the group. Use only the programming techniques you
 * learned in this chapter.
 */

package Cap1;

import java.util.Scanner;

public class ex2_24 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int a, b, c, d, e;
		
		System.out.print("Insert the first integer: ");
		a = input.nextInt();
		
		System.out.print("Insert the second integer: ");
		b = input.nextInt();
		
		System.out.print("Insert the third integer: ");
		c = input.nextInt();
		
		System.out.print("Insert the fourth integer: ");
		d = input.nextInt();
		
		System.out.print("Insert the fifth integer: ");
		e = input.nextInt();
		
		if(a>b)
			if(a>c)
				if(a>d)
					if(a>e)
						System.out.printf("The largest is %d.%n", a);
		if(b>a)
			if(b>c)
				if(b>d)
					if(b>e)
						System.out.printf("The largest is %d.%n", b);
		if(c>b)
			if(c>a)
				if(c>d)
					if(c>e)
						System.out.printf("The largest is %d.%n", c);
		if(d>b)
			if(d>c)
				if(d>a)
					if(d>e)
						System.out.printf("The largest is %d.%n", d);
		if(e>b)
			if(e>c)
				if(e>d)
					if(e>a)
						System.out.printf("The largest is %d.%n", e);
		if(a<b)
			if(a<c)
				if(a<d)
					if(a<e)
						System.out.printf("The smallest is %d.%n", a);
		if(b<a)
			if(b<c)
				if(b<d)
					if(b<e)
						System.out.printf("The smallest is %d.%n", b);
		if(c<b)
			if(c<a)
				if(c<d)
					if(c<e)
						System.out.printf("The smallest is %d.%n", c);
		if(d<b)
			if(d<c)
				if(d<a)
					if(d<e)
						System.out.printf("The smallest is %d.%n", d);
		if(e<b)
			if(e<c)
				if(e<d)
					if(e<a)
						System.out.printf("The smallest is %d.%n", e);
		
	}
}
