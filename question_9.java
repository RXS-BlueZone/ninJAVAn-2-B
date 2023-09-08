import java.util.Scanner;

public class question_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year;
		
		System.out.print("Enter a year: ");
		year = scanner.nextInt();
		
		if (year % 4 == 0) {
	        if (year % 100 == 0) {
	            if (year % 400 == 0) {
	                System.out.println(year + " is a leap year.");
	            } else {
	                System.out.println(year + " is not a leap year.");
	            }
	        } else {
	            System.out.println(year + " is a leap year.");
	        }
	    } else {
	        System.out.println(year + " is not a leap year.");
	    }
		scanner.close();
	}

}
