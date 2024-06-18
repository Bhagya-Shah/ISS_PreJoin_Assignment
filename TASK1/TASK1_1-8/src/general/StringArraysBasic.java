package general;
import java.util.Arrays;

public class StringArraysBasic {
    // String operations
    private static void stringOperations() {
        String str1 = "Hello, World!";
        String str2 = new String("Hello, Java!");

        // String operations
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));
        System.out.println("Substring from index 7 in str1: " + str1.substring(7));
        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("Comparing str1 and str2: " + str1.compareTo(str2));
        System.out.println("str1 in lowercase: " + str1.toLowerCase());
        System.out.println("str2 in uppercase: " + str2.toUpperCase());
        String str3 = "   Hello, trimmed!   ";
        System.out.println("Trimmed str3: '" + str3.trim() + "'");
        System.out.println("Replacing 'World' with 'Java' in str1: " + str1.replace("World", "Java"));
        System.out.println();
    }

    // Method to demonstrate various array operations
    private static void arrayOperations() {
        // Creating arrays
        int[] intArray = {4, 5, 3, 1, 2};
        String[] stringArray = new String[3];
        stringArray[0] = "Bhagya";
        stringArray[1] = "Ariyan";
        stringArray[2] = "Bhavya";

        // Array operations
        System.out.println("Array Operations:");
        System.out.println("Element at index 0 in intArray: " + intArray[0]);
        System.out.println("Element at index 1 in stringArray: " + stringArray[1]);
        System.out.println("Length of intArray: " + intArray.length);
        System.out.println("Length of stringArray: " + stringArray.length);

        // Printing All Array elements
        System.out.print("intArray elements: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        // Using another for loop
        System.out.print("stringArray elements: ");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();

        // Arrays utility class
        Arrays.sort(intArray);
        System.out.print("Sorted intArray: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        stringOperations();
        arrayOperations();
    }
}
