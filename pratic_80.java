public class pratic_80 {
    public static void main(String[] args) {
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 99, 99, 99, 99, 99}));  // Output: 1
        System.out.println(isSequentiallyBounded(new int[]{1, 2, 3}));  // Output: 0
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 2, 5}));  // Output: 0
    }

    static int isSequentiallyBounded(int[] a) {
        if (a.length == 0) {
            return 1;
        }

        if (a[0] <= 0) {
            return 0;
        }

        int count = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i-1] || a[i] <= 0) {
                return 0;
            } else if (a[i] == a[i-1]) {
                count++;
                if (count >= a[i]) {
                    return 0;
                }
            } else {
                count = 1;
            }
        }

        return 1;
    }
}
