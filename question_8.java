import java.util.Scanner;

public class question_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter;

        while (true) {
            System.out.print("Input a single character from the alphabet: ");
            String input = scanner.next();

            if (input.length() == 1) {
                letter = input.charAt(0);
                if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
                    if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' ||
                        letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' ||
                        letter == 'u' || letter == 'U') {
                        System.out.println("Input letter is a VOWEL.");
                    } else {
                        System.out.println("Input letter is a CONSONANT.");
                    }
                    break;
                } else {
                    System.out.println("Error: Please enter a valid alphabet character. \n");
                }
            } else {
                System.out.println("Error: Please enter a single alphabet character. \n");
            }
        }

        scanner.close();
    }
}
