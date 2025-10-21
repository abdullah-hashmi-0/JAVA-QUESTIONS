import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        float a = sc.nextFloat();

        System.out.print("Enter b: ");
        Float b = sc.nextFloat();

        System.out.println("Choose an operation:");
        System.out.println("1: + (Addition)");
        System.out.println("2: - (Subtraction)");
        System.out.println("3: * (Multiplication)");
        System.out.println("4: / (Division)");
        System.out.println("5: % (Modulo)");

        System.out.print("Enter the operation number from 1 to 5: ");
        int operation = sc.nextInt();

        switch (operation) {

            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                }
                break;
            case 5:
                if (b != 0) {
                    System.out.println("Result: " + (a % b));
                } else {
                    System.out.println("Error: Modulo by zero is not allowed!");
                }
                break;
                
            default:
                System.out.println("Invalid operation. Please select a number between 1 and 5.");
        }
        sc.close();
    }
}