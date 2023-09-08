import java.util.Scanner;

public class question_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		
		System.out.print("Enter a number: ");
		number = scanner.nextInt();
		
		if (number > 0) {
			System.out.println("Number is positive.");
		} else if (number < 0) {
			System.out.println("Number is negative.");
		} else if (number == 0){
			System.out.println("Zero cannot be defined as positive or negative.");
		}
	scanner.close();
	}

}
