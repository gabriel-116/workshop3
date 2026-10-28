import java.util.Scanner;

public class NumberToLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 35: ");
        int num = scanner.nextInt();

        if (num <= 9) {
            System.out.println(num);
        } else {
            // 10 -> 'A' (65), 11 -> 'B' (66), ... 35 -> 'Z' (90)
            char letter = (char) ('A' + (num - 10));
            System.out.println(letter);
        }
        scanner.close();
    }
}
