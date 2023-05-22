public class pratic_43 {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 2, 2, 2, 3, 3};
        int[] array2 = {3, 3, 3, 3, 3, 3, 3};
        int[] array3 = {1, 2, 2, 2, 3, 3};
        int[] array4 = {2, 2, 2, 3, 3, 1, 1};
        int[] array5 = {2};
        int[] array6 = {};

        System.out.println(isLayered(array1)); // 1
        System.out.println(isLayered(array2)); // 1
        System.out.println(isLayered(array3)); // 0
        System.out.println(isLayered(array4)); // 0
        System.out.println(isLayered(array5)); // 0
        System.out.println(isLayered(array6)); // 0
    }

    static int isLayered(int[] a) {
        if (a.length < 2) {
            return 0;
        }

        int prev = a[0];
        int count = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == prev) {
                count++;
            } else if (a[i] > prev && count >= 2) {
                prev = a[i];
                count = 1;
            } else {
                return 0;
            }
        }

        return (count >= 2) ? 1 : 0;
    }
}
