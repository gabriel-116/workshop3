import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double c = scanner.nextDouble();

        double smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;

        System.out.println("The smallest number is: " + smallest);
        scanner.close();
    }
}
