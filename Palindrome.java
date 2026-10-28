import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        StringBuffer reversed = new StringBuffer(word);
        reversed.reverse();

        if (word.equalsIgnoreCase(reversed.toString())) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }
        scanner.close();
    }
}
