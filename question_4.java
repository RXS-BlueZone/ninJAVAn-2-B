import java.util.Scanner; 

public class question_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String rollNumber;
        String fieldOfInterest;
        
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your roll number: ");
        rollNumber = scanner.nextLine();

        System.out.print("Enter your field of interest: ");
        fieldOfInterest = scanner.nextLine();

        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ". My field of interest is " + fieldOfInterest + ".");

        scanner.close();
    }
}

