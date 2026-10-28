public class NationalDebt {
    public static void main(String[] args) {
        // Approximate USA national debt in dollars (about $36 trillion)
        long debtLong = 36_000_000_000_000L;
        System.out.println("As a long: " + debtLong);

        // long assigned to int (narrowing conversion):
        int debtInt = (int) debtLong;
        System.out.println("As an int: " + debtInt);
        // The value changes completely. An int can only hold up to about 2.1 billion,
        // so 36 trillion overflows and wraps around (mod 2^32) into a meaningless small number.

        double debtDouble = 36_000_000_000_000.0;
        System.out.println("As a double: " + debtDouble);

        // double assigned to byte (narrowing conversion):
        byte debtByte = (byte) debtDouble;
        System.out.println("As a byte: " + debtByte);
        // A byte only holds -128 to 127. Casting takes only the lowest 8 bits,
        // so the result is a tiny, meaningless number.
    }
}
