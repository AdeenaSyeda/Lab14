import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the first integer: ");
			int num1 = scanner.nextInt();
			System.out.print("Enter the second integer: ");
			int num2 = scanner.nextInt();

			try {
			    int result = num1 / num2;
			    System.out.println("The result is: " + result);
			} catch (ArithmeticException e) {
			    System.out.println("Cannot divide by zero");
			} catch (NumberFormatException e) {
			    System.out.println("Invalid input, please enter integers only");
			}
		}
    }
}
