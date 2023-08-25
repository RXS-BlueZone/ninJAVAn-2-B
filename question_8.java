import java.util.Scanner;

public class question_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        
        boolean allEqual;
        boolean anyTwoEqual;
        
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        num3 = scanner.nextDouble();

        allEqual = num1 == num2 && num2 == num3;
        anyTwoEqual = num1 == num2 || num2 == num3 || num1 == num3;

        if (allEqual) {
            System.out.println("All three numbers are equal.");
        } else {
            System.out.println("All three numbers are not equal.");
        }

        if (anyTwoEqual) {
            System.out.println("Any two of the three numbers are equal.");
        } else {
            System.out.println("No two numbers are equal.");
        }

        scanner.close();
    }
}
