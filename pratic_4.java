public class pratic_4 {
    public static void main(String[] args){
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
    }

    public static int largestPrimeFactor(int n) {
        if (n <= 1) {
            return 0;
        }

        int largestFactor = 1;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                largestFactor = i;
                n /= i;
            }
        }

        return largestFactor;
    }

}
