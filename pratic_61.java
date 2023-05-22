public class pratic_61 {
    public static void main(String[] args) {
        int[][] testArrays = {
                {3, 0, 2, -5, 0},
                {9, -3, -3, -1, -1},
                {1},
                {0, 0, 0},
        };

        for (int[] testArray : testArrays) {
            System.out.println(sumFactor(testArray));
        }
    }

    static int sumFactor(int[] a) {
        int sum = 0;
        for (int value : a) {
            sum += value;
        }

        int count = 0;
        for (int value : a) {
            if (value == sum) {
                count++;
            }
        }

        return count;
    }
}
