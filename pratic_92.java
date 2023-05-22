public class pratic_92 {
    public static void main(String[] args) {
        System.out.println(isZeroLimited(new int[]{1, 0, 5, -1, 0, 2, 3, 0, 8})); // Output: 1
        System.out.println(isZeroLimited(new int[]{0, 0, 0, 0, 0})); // Output: 0
        System.out.println(isZeroLimited(new int[]{1, 0})); // Output: 1
        System.out.println(isZeroLimited(new int[]{0, 1})); // Output: 0
        System.out.println(isZeroLimited(new int[]{5})); // Output: 1
        System.out.println(isZeroLimited(new int[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0})); // Output: 1
        System.out.println(isZeroLimited(new int[]{})); // Output: 1
    }

    public static int isZeroLimited(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if ((i - 1) % 3 == 0) {
                if (a[i] != 0) {
                    return 0;
                }
            } else {
                if (a[i] == 0) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
