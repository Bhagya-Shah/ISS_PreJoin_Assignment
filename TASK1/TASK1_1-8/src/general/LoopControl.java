// Loop Control and Decision Making 
/*
 * Decision Making: Uses if, if-else, and switch statements to control the flow based on conditions.
 * Loop Control: Uses for, while, do-while, and for-each loops to repeat a block of code multiple times.
*/
package general;

public class LoopControl {
	public static void main(String[] args) {
        int number = 10;
        if (number > 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is non-positive.");
        }

        switch (number % 2) {
            case 0:
                System.out.println("Number is even.");
                break;
            case 1:
                System.out.println("Number is odd.");
                break;
            default:
                System.out.println("Invalid number.");
                break;
        }

        // Loop control
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i: " + i);
        }

        System.out.println("While loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println("i: " + i);
            i++;
        }

        System.out.println("Do-while loop:");
        i = 1;
        do {
            System.out.println("i: " + i);
            i++;
        } while (i <= 5);

        System.out.println("For-each loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
        
        System.out.println("Continue:");
        for (int j : numbers) {
			if(j==3) {
				continue;
			}else {
				System.out.println("Number: " + j);
			}
		}
        System.out.println("Break:");
        for (int j : numbers) {
			if(j==3) {
				break;
			}else {
				System.out.println("Number: " + j);
			}
		}
	}
}
