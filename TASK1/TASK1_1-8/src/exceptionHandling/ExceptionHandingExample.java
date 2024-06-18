package exceptionHandling;

/*
 * Checked Exception -> File reader
 * Unchecked Exception -> ArraysOutOfBound
 * Errors -> Stack overflow
 */
/*
 * Syntax
	try {
	   // Protected code
	} catch (ExceptionName e1) {
	   // Catch block
	}
 */
/*
	Handling Exceptions
	Exceptions in Java can be handled using try, catch, finally, and try-with-resources.
*/
/*
 * throw vs throws
	throw: Used to explicitly throw an exception.
	throws: Used in method signatures to declare that a method can throw specific exceptions
*/
/*
 * Methods:
1	public String getMessage()
2	public Throwable getCause()
3	public String toString()
4	public void printStackTrace()
5	public StackTraceElement [] getStackTrace()
6	public Throwable fillInStackTrace()
 */
public class ExceptionHandingExample {
	public static void main(String[] args) {
		//1. ArrayOutOfBound
		int a[] = new int[2];
		try {
			System.out.println(a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Exception " + e);
		}
	}
}
