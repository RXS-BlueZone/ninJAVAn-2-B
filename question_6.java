import java.util.Scanner;

public class question_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double number;
		double square;
		
		System.out.println("What number do you want to be squared?");
		number = scanner.nextDouble();
		
		square = number * number;
		
		System.out.println("The square of " + number + " is " + square + ".");

        scanner.close();
    }
}
