public class pratic_89 {
    public static void main(String[] args) {
        int[][] testArrays = {
                {9, -9},
                {9, -9},
                {9, -9},
                {9, -9},
                {9, -9},
                {9, -9, 5},
                {0, 9, 12, 18, -6}
        };
        int[] testNums = {0, 1, 2, 3, 4, 3, 11};

        for (int i = 0; i < testArrays.length; i++) {
            int[] result = filterArray(testArrays[i], testNums[i]);
            if (result != null) {
                for (int num : result) {
                    System.out.print(num + " ");
                }
                System.out.println();
            } else {
                System.out.println("null");
            }
        }
    }

    public static int[] filterArray(int[] a, int n) {
        int[] temp = new int[a.length];
        int count = 0;
        int index = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                if (index >= a.length) {
                    return null;
                }
                temp[count++] = a[index];
            }
            index++;
            n >>= 1;
        }

        int[] res = new int[count];
        for (int i = 0; i < count; i++) {
            res[i] = temp[i];
        }
        return res;
    }
}
