import java.util.Scanner;

public class question_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		float num1, num2;
		
		
		System.out.println("Input a floating-point number");
		num1 = scanner.nextFloat();
		System.out.println("Input amother floating-point number");
		num2 = scanner.nextFloat();
		
		num1 = (float) (Math.round(num1 * 1000.0) / 1000.0);
		num2 = (float) (Math.round(num2 * 1000.0) / 1000.0);
		
		System.out.println(num1 == num2 ? "They are equal" : "They are different");

		scanner.close();
		}
	}
