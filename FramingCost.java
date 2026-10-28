import java.util.Scanner;

public class FramingCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. length and width of the picture
        System.out.print("Enter the length of the picture (inches): ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the picture (inches): ");
        double width = scanner.nextDouble();

        // b. type of frame
        System.out.print("Enter frame type (regular or fancy): ");
        String type = scanner.next();

        // c. colour of the frame
        System.out.print("Enter the colour for the frame: ");
        String colour = scanner.next();

        // d. number of crowns
        System.out.print("Enter number of crowns (0 if none): ");
        int crowns = scanner.nextInt();

        // The frame runs around the picture: perimeter = 2*(length + width)
        double perimeter = 2 * (length + width);

        double framePerInch = type.equalsIgnoreCase("fancy") ? 0.25 : 0.15;
        double colourPerInch = 0.10;
        double crownCost = crowns * 0.35;

        double total = perimeter * (framePerInch + colourPerInch) + crownCost;

        System.out.println("Frame colour: " + colour);
        System.out.printf("Total cost of framing: $%.2f%n", total);

        scanner.close();
    }
}
