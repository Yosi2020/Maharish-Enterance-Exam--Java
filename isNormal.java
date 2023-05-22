public class isNormal {
    public static int isNormal(int n) {
        if (n <= 0) return 0;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) { // i is a factor of n
                if (i % 2 != 0 || (n / i) % 2 != 0) { // i or n/i is odd
                    return 0; // n is not normal
                }
            }
        }
        return 1; // n is normal
    }
}
