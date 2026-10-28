public class PrecisionDemo {
    public static void main(String[] args) {
        // PI accurate to 10 decimal places, stored in a double
        double pi = 3.1415926535;
        float piFloat = (float) pi;
        System.out.println("Double PI: " + pi);
        System.out.println("Float PI:   " + piFloat);
        // The float loses precision and prints roughly 3.1415927 instead of 3.1415926535.

        double money1 = 23.99;
        System.out.println("23.99 as double: " + money1);
        // Because double is binary floating point, 23.99 cannot be represented exactly;
        // it may print as something like 23.989999999999998.

        double money2 = 23.00;
        System.out.println("23.00 as double: " + money2);
        // Whole/zero-cent values are exact in binary, so this prints 23.0.
    }
}
