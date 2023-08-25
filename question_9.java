import java.util.Scanner;

public class question_9 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        
        System.out.print("Enter the value of 'a': ");
        a = scanner.nextInt();

        System.out.print("Enter the value of 'b': ");
        b = scanner.nextInt();

        boolean condition1 = a < 50;
        boolean condition2 = a < b;

       System.out.println("Condition 'a < 50': " + condition1);
       System.out.println("Condition 'a < b': " + condition2);
       
       scanner.close();
    }
}
