public class pratic_46 {
    public static void main(String[] args) {
        System.out.println(isConsecutiveFactored(24));
        System.out.println(isConsecutiveFactored(105));
        System.out.println(isConsecutiveFactored(90));
        System.out.println(isConsecutiveFactored(23));
        System.out.println(isConsecutiveFactored(15));
        System.out.println(isConsecutiveFactored(2));
        System.out.println(isConsecutiveFactored(0));
        System.out.println(isConsecutiveFactored(-12));
    }

    public static int isConsecutiveFactored(int n) {
        if (n <= 1) {
            return 0;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0 && n % (i + 1) == 0) {
                return 1;
            }
        }
        return 0;
    }
}
