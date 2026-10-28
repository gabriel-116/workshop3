import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an hour (1-24): ");
        int hour = scanner.nextInt();
        if (hour < 18) {
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }

        int n = 10;
        while (n <= 95) {
            if (n % 5 == 0) {
                System.out.println(n);
            }
            n++;
        }

        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of 1 to 10 is: " + sum);
        scanner.close();
    }
}
