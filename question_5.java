import java.util.Scanner;

public class question_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side;
        double area;
        double perimeter;

        System.out.println("What is the side of the square?");
        side = scanner.nextDouble();

        area = side * side;
        perimeter = 4 * side;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
      
    scanner.close();
    }
}
