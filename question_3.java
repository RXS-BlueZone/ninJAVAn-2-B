import java.util.Scanner;

public class question_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double rectangleLength;
		double rectangleBreadth;
		double area;
		int intArea;

		System.out.print("Enter the length of the rectangle: ");
		rectangleLength = scanner.nextDouble();
		
		System.out.print("Enter the breadth of the rectangle: ");
		rectangleBreadth = scanner.nextDouble();
		
		area = rectangleLength * rectangleBreadth;
		intArea = (int) area;
		
		System.out.println("The area of the triangle is " + intArea + ".");
		
		scanner.close();
	}
	
}