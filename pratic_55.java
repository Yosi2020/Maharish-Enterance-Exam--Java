public class pratic_55 {
    public static void main(String[] args) {
        System.out.println(isMadhavArray(new int[]{2, 1, 1}));
        System.out.println(isMadhavArray(new int[]{2, 1, 1, 4, -1, -1}));
        System.out.println(isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
        System.out.println(isMadhavArray(new int[]{18, 9, 10, 6, 6, 6}));
        System.out.println(isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4}));
        System.out.println(isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}));
        System.out.println(isMadhavArray(new int[]{3, 1, 2, 3, 0}));
    }

    public static boolean isValidLength(int len) {
        int n = 0;
        while (n * (n + 1) / 2 < len) {
            n++;
        }
        return n * (n + 1) / 2 == len;
    }

    public static int isMadhavArray(int[] a) {
        int len = a.length;

        if (!isValidLength(len)) return 0;

        int n = 0;
        while (n * (n + 1) / 2 < len) {
            n++;
        }

        int sum = a[0];
        int index = 1;

        for (int i = 2; i <= n; i++) {
            int currentSum = 0;
            for (int j = 0; j < i; j++) {
                if (index < len) {
                    currentSum += a[index];
                    index++;
                }
            }
            if (currentSum != sum) return 0;
        }

        return 1;
    }
}


