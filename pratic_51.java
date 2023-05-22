public class pratic_51 {
    public static void main(String[] args) {
        System.out.println(isSymmetric(new int[]{1, 2, 3, 2, 1}));
        System.out.println(isSymmetric(new int[]{4, 5, 6, 6, 5, 4}));
        System.out.println(isSymmetric(new int[]{1, 2, 3, 4, 5}));
        System.out.println(isSymmetric(new int[]{1, 2, 3, 4, 3, 2, 1}));
    }

    public static int isSymmetric(int[] a) {
        int n = a.length;

        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - i - 1]) {
                return 0;
            }
        }
        return 1;
    }
}
