public class OneZeroOnePattern {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++)
                System.out.print(" ");

            // Print 1s and 0s
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j % 2 == 1)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }

    }
}
