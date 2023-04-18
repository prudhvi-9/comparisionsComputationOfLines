package comparisionComputationOfLines;

import java.util.Scanner;

public class UsingOops extends Lines {
	/**
	 * This method is created to calculate the length of two lines and compare them.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 1) Get the value from user for length of the two lines. 2)To find the length
		 * of the two lines. 3)To compare both the line.
		 * 
		 */

		System.out.println("Welcome to Line Comparsion Computation Program");

		/*
		 * 1) Get the value from user for length of the two lines.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("For Line1,enter the values. ");
		System.out.println("Enter value of x1");
		x1 = sc.nextInt();

		System.out.println("Enter value of x2");
		x2 = sc.nextInt();

		System.out.println("Enter value of y1");
		y1 = sc.nextInt();

		System.out.println("Enter value of y2");
		y2 = sc.nextInt();

		System.out.println("For Line2,enter the values. ");
		System.out.println("Enter value of p1");
		p1 = sc.nextInt();

		System.out.println("Enter value of p2");
		p2 = sc.nextInt();

		System.out.println("Enter value of q1");
		q1 = sc.nextInt();

		System.out.println("Enter value of q2");
		q2 = sc.nextInt();

		/**
		 * 2)To find the length of the two lines.
		 */
		UsingOops.checklengthofline1();
		UsingOops.checklengthofline2();

		/**
		 * 3)To compare both the line.
		 */

		UsingOops.checklengthoftwolines();

		sc.close();
	}

}
