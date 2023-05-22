public class Solve10 {
    public static void main(String[] args) {
        int[] result = solve10();
        System.out.println("x: " + result[0] + ", y: " + result[1]);
    }

    static int[] solve10() {
        long[] factorials = new long[11];
        factorials[0] = 1;
        for (int i = 1; i <= 10; i++) {
            factorials[i] = i * factorials[i - 1];
        }

        for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
                if (factorials[x] + factorials[y] == factorials[10]) {
                    return new int[] {x, y};
                }
            }
        }

        // Should never reach here if solution exists
        return new int[] {-1, -1};
    }
}
