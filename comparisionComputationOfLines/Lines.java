package comparisionComputationOfLines;

public abstract class Lines {

	static int x1;
	static int y1;
	static int p1;
	static int q1;
	static int x2;
	static int y2;
	static int p2;
	static int q2;
	static int D1;
	static int D2;

	/**
	 * 1)To find the length of the two lines.
	 */
	public static void checklengthofline1() {
		double x = Math.pow((x2 - x1), 2);
		double y = Math.pow((y2 - y1), 2);
		D1 = (int) Math.sqrt(x + y);
		System.out.println("length of the line1:" + D1);
	}

	public static void checklengthofline2() {
		double p = Math.pow((p2 - p1), 2);
		double q = Math.pow((q2 - q1), 2);
		D2 = (int) Math.sqrt(p + q);
		System.out.println("length of the line2:" + D2);
	}

	public static void checklengthoftwolines() {

		@SuppressWarnings("removal")
		Integer obj1 = new Integer(D1);
		@SuppressWarnings("removal")
		Integer obj2 = new Integer(D2);

		/**
		 * 2)To check whether two lines are equal or not.
		 */

		if (obj1.equals(obj2)) {
			System.out.println("Length of both lines are equal");
		} else {
			System.out.println("Length of both lines are  not equal");
		}

		/**
		 * 3)To compare both the line
		 */


		int ans = obj1.compareTo(obj2);

		if (ans==0 ) {
			System.out.println("Length of line 1 is equal to the length of line 2");
		} else if (ans < 0) {
			System.out.println("Length of line 1 is less than length of line 2");
		} else  {
			System.out.println("Length of line 1 is greater than length of line 2");
		}

	}
}
