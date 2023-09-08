import java.util.Scanner;

public class question_4 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		float input;
		System.out.print("Enter a value: ");
		input = cin.nextFloat();
		
		if (input < 1 && input > 0){
			System.out.println("Input value: " + input);
			System.out.println("Small Positive number");
		}
		else if (input > -1 && input < 0){
			System.out.println("Input Value: " + input);
			System.out.println("Small Negative number");
		}
		else if (input > 0 && 1000000.0 > input){
			System.out.println("Input Value: " + input);
			System.out.println("Positive number");
		}
		else if (input > 0 && 1000000.0 < input){
			System.out.println("Input Value: " + input);
			System.out.println("Large Positive number");
		}
		else if (input < 0 && -1000000.0 < input){
			System.out.println("Input Value: " + input);
			System.out.println("Negative number");
		}
		else if (input < 0 && -1000000.0 > input){
			System.out.println("Input Value: " + input);
			System.out.println("Large Negative number");
		}
		else{
			System.out.println("Input Value: " + input);
			System.out.println("Zero");
		}
			cin.close();
	}


}
