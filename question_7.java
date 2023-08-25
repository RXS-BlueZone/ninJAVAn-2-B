import java.util.Scanner;

public class question_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String firstString = null;
		String secondString = null;
		
		System.out.print("Enter your first word: ");
		firstString = scanner.next();

		System.out.print("Enter your second word: ");
		secondString = scanner.next();
		
		System.out.println(firstString + secondString);
		
		scanner.close();
	}

}
