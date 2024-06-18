package exceptionHandling;

public class MultiTry {

	public static void main(String args[]) {
		try {
			int a[] = new int[2];
			try {
				int b = 0;
				int c = 1 / b;
			} catch (Exception e) {
				System.out.println("Exception thrown: " + e);
			}
			System.out.println("Element three :" + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown: " + e);
		} finally {
			System.out.println("End of Program");
		}
	}
}