package comparisionComputationOfLines;

import java.util.*;

public class ComparingTwoLines {
	/**
	 * This method is created to calculate the length of two lines and compare them.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparsion Computation Program");

		/**
		 * 1) Get the value from user for length of the two lines. 
		 * 2)To find the length of the two lines.
		 * 3)To check whether two lines are equal or not.
		 * 4)To compare both the line.
		 */ 

		/*
		 * 1) Get the value from user for length of the two lines.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Please value of x1");
		int x1 = sc.nextInt();
		
		System.out.println("Please value of x2");
		int x2 = sc.nextInt();

		System.out.println("Please value of y1");
		int y1 = sc.nextInt();
		
		System.out.println("Please value of y2");
		int y2 = sc.nextInt();

		System.out.println("Please value of p1");
		int p1 = sc.nextInt();
		
		System.out.println("Please value of p2");
		int p2 = sc.nextInt();

		System.out.println("Please value of q1");
		int q1 = sc.nextInt();
		
		System.out.println("Please value of q2");
		int q2 = sc.nextInt();
		/**
		 * 2)To find the length of the two lines.
		 */

		double x = Math.pow((x2 - x1), 2);
		double y = Math.pow((y2 - y1), 2);
		int D1 = (int) Math.sqrt(x + y);
		System.out.println("length of the line1:" + D1);

		double p = Math.pow((p2 - p1), 2);
		double q = Math.pow((q2 - q1), 2);
		int D2 = (int) Math.sqrt(p + q);
		System.out.println("length of the line1:" + D2);

		/**
		 * 3)To check whether two lines are equal or not.
		 */

		Integer obj1 = new Integer(D1);
		Integer obj2 = new Integer(D2);

		boolean Res = obj1.equals(obj2);
		if (Res) {
			System.out.println("Length of both lines are equal");
		} else {
			System.out.println("Length of both lines are  not equal");
		}

		/**
		 * 4)To compare both the line
		 */

		int ans = obj1.compareTo(obj2);

		if (ans > 0) {
			System.out.println("Length of line 1 is greater than length of line 2");
		} else if (ans < 0) {
			System.out.println("Length of line 1 is less than length of line 2");
		} else {
			System.out.println("Length of line 1 is equal to the length of line 2");
		}
		sc.close();

	}
}

