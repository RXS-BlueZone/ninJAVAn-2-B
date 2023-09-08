import java.util.Scanner;

public class question_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input1, input2, input3;
        
        System.out.print("Enter Input 1: ");
        input1 = scanner.nextDouble();
        
        System.out.print("Enter Input 2: ");
        input2 = scanner.nextDouble();
        
        System.out.print("Enter Input 3: ");
        input3 = scanner.nextDouble();
        
        scanner.close();
        
        if (input1 >= input2 && input1 >= input3) {
            System.out.println("The greatest: " + input1);
        } else if (input2 >= input1 && input2 >= input3) {
            System.out.println("The greatest: " + input2);
        } else {
            System.out.println("The greatest: " + input3);
        }
    }
}
