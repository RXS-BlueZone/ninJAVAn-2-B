import java.util.Scanner;

public class question_2 {

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int firstInteger;
	int secondInteger;
	int sum;
	int product;
	
	System.out.print("Please enter the first integer: ");
	firstInteger = scanner.nextInt();
	
	System.out.print("Please enter the second integer: ");
	secondInteger = scanner.nextInt();
	
	sum = firstInteger + secondInteger;
	System.out.println("Sum: " + sum);
	
	product = firstInteger * secondInteger;
	System.out.println("Product: " + product);
	
	scanner.close();
	}

}
