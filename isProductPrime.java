public class isProductPrime {
    public static int isPrimeProduct(int n) {
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                if (isPrime(i) && isPrime(n / i)) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static boolean isPrime(int m) {
        if (m <= 1) return false;
        for (int i = 2; i * i <= m; i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }

}
