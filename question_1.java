import java.util.Scanner;

public class question_1 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int firstInteger;
	int secondInteger;
	int total;
	
	System.out.print("Please enter the first integer: ");
	firstInteger = scanner.nextInt();
	
	System.out.print("Please enter the second integer: ");
	secondInteger = scanner.nextInt();
	
	
	total = firstInteger + secondInteger;
	System.out.print("Total: " + total);
	
	scanner.close();
	}

}
