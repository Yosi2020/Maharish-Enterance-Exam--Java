public class isNormall {
    public static void main(String[] args) {
        System.out.println(isNormal(1)); // returns 1
        System.out.println(isNormal(2)); // returns 1
        System.out.println(isNormal(3)); // returns 1
        System.out.println(isNormal(4)); // returns 1
        System.out.println(isNormal(5)); // returns 1
        System.out.println(isNormal(7)); // returns 1
        System.out.println(isNormal(8)); // returns 1
        System.out.println(isNormal(6)); // returns 0
        System.out.println(isNormal(9)); // returns 0
        System.out.println(isNormal(10)); // returns 0
    }

    static int isNormal(int n) {
        if (n == 1) {
            return 1;
        }

        for (int i = 3; i <= n / 2; i += 2) {
            if (n % i == 0) {
                return 0;
            }
        }

        return 1;
    }
}

