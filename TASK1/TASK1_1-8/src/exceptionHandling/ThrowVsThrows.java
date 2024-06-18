package exceptionHandling;

//Custom exception class
class CustomException extends Exception {
	public CustomException(String message) {
		super(message);
	}
}

public class ThrowVsThrows {

	// Method for 'throws' keyword
	public static void readFile(String filePath) throws CustomException {
		if (filePath == null || filePath.isEmpty()) {
			throw new CustomException("File path cannot be null or empty.");
		}
		System.out.println("Reading file: " + filePath);
	}

	// Method demonstrating 'throw' keyword
	public static void validateAge(int age) {
		if (age < 18) {
			throw new IllegalArgumentException("Age must be at least 18.");
		} else {
			System.out.println("Age is valid.");
		}
	}

	public static void main(String[] args) {
		// Checked exceptions -> throws
		try {
			readFile(""); // This will throw CustomException
		} catch (CustomException e) {
			System.err.println("CustomException: " + e.getMessage());
		}

		// Unchecked exceptions -> throw
		try {
			validateAge(16); // This will throw IllegalArgumentException
		} catch (IllegalArgumentException e) {
			System.err.println("IllegalArgumentException caught: " + e.getMessage());
		}

		// Valid Age and filePath
		try {
			readFile("exampleFile.txt");
			validateAge(20);
		} 
		//multiple catch
		catch (CustomException | IllegalArgumentException e) {
			System.err.println("Exception: " + e.getMessage());
		}
	}
}
