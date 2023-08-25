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

        boolean bothConditionsTrue = a < 50 && a < b;

       System.out.println(bothConditionsTrue);
       
       scanner.close();
    }
}
