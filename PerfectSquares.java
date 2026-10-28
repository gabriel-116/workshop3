public class PerfectSquares {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            double root = Math.sqrt(i);
            if (root == (int) root) {
                System.out.println(i);
            }
        }
        // Output: 1 4 9 16 25 36 49 64 81 100
    }
}
