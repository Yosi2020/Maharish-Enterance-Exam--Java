public class pratic_40 {
    public static void main(String[] args) {
        System.out.print(isSameNumberOfFactors(-6, 21));
        System.out.print(isSameNumberOfFactors(6, 21));
        System.out.print(isSameNumberOfFactors(8, 12));
        System.out.print(isSameNumberOfFactors(23, 97));
        System.out.print(isSameNumberOfFactors(0, 1));
        System.out.print(isSameNumberOfFactors(0, 0));
    }

    public static int isSameNumberOfFactors(int n1, int n2) {
        if (n1 < 0 || n2 < 0) {
            return -1;
        }
        if (n1 == n2) {
            return 1;
        }
        if (numberFactors(n2) == numberFactors(n1)) {
            return 1;
        }
        return 0;
    }

    public static int numberFactors(int n) {
        int factor = 1, count = 0;
        while (factor <= n) {
            if (n % factor == 0) {
                count++;
            }
            factor++;
        }
        return count;
    }
}

