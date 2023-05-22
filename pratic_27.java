public class pratic_27 {
    public static void main(String[] args) {
        System.out.println(is235Array(new int[]{2, 3, 5, 7, 11})); // Output: 1
        System.out.println(is235Array(new int[]{2, 3, 6, 7, 11})); // Output: 0
        System.out.println(is235Array(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10})); // Output: 0
        System.out.println(is235Array(new int[]{2, 4, 8, 16, 32})); // Output: 1
        System.out.println(is235Array(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1})); // Output: 1
        System.out.println(is235Array(new int[]{7, 11, 77, 49})); // Output: 1
        System.out.println(is235Array(new int[]{2})); // Output: 1
        System.out.println(is235Array(new int[]{})); // Output: 1
        System.out.println(is235Array(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7})); // Output: 1
    }

    static int is235Array(int[] a) {
        int count2 = 0, count3 = 0, count5 = 0, countOthers = 0;

        for (int num : a) {
            if (num % 2 == 0) {
                count2++;
            }
            if (num % 3 == 0) {
                count3++;
            }
            if (num % 5 == 0) {
                count5++;
            }
            if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {
                countOthers++;
            }
        }

        if (count2 + count3 + count5 + countOthers == a.length) {
            return 1;
        } else {
            return 0;
        }
    }
}
