public class pratic_60 {

    public static void main(String[] args) {
        int[][] testArrays = {
                {1},
                {0},
                {3, 1, 1, 4},
                {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4},
                {}
        };

        for (int[] testArray : testArrays) {
            System.out.println(stantonMeasure(testArray));
        }
    }

    static int stantonMeasure(int[] a) {
        int countOnes = 0;
        for (int value : a) {
            if (value == 1) {
                countOnes++;
            }
        }

        int count = 0;
        for (int value : a) {
            if (value == countOnes) {
                count++;
            }
        }

        return count;
    }

}
