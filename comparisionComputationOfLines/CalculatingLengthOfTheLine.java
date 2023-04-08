package comparisionComputationOfLines;

import java.util.Scanner;

public class CalculatingLengthOfTheLine {
	
	/**
	 * This method is created to calculate the length of two lines .
	 * 
	 * @param args
	 */

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			/**
			 * 1) Get the value from user for length of the two lines. 
			 * 2)To find the length of the two lines
			 */
			 
			System.out.println("Welcome to Line Comparsion Computation Program");

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
			sc.close();
		}


}
