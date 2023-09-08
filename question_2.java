import java.util.Scanner;

public class question_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print("Input a: ");
        a = scanner.nextDouble();

        System.out.print("Input b: ");
        b = scanner.nextDouble();

        System.out.print("Input c: ");
        c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double realRoot = -b / (2 * a);
            System.out.println("The root is " + realRoot);
        } else {
            double realRoot = -b / (2 * a);
            double imaginaryRoot = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The roots are " + realRoot + " + " + imaginaryRoot + "i and " + realRoot + " - " + imaginaryRoot + "i");
        }

        scanner.close();
    }
}
