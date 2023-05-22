public class pratic_56 {
    public static void main(String[] args){
        int[][] testArrays = {
                {1},
                {2},
                {1, 2, 3, 4},
                {1, 1, 1, 1, 1, 1, 2},
                {2, 12, 4, 6, 8, 11},
                {2, 12, 12, 4, 6, 8, 11},
                {-2, -4, -6, -8, -11},
                {2, 3, 5, 7},
                {2, 4, 6, 8, 10}
        };

        for (int[] testArray : testArrays) {
            System.out.println(isInertial(testArray));
        }
    }
    public static int isInertial(int[] a) {
        if (a == null || a.length == 0) {
            return 0;
        }

        int max = Integer.MIN_VALUE;
        int minNonMaxEven = Integer.MIN_VALUE;
        boolean hasOdd = false;

        // First pass: find the maximum value, the minimum non-max even value, and check if the array has any odd values
        for (int value : a) {
            if (value > max) {
                max = value;
            }
            if (value % 2 == 1) {
                hasOdd = true;
            }
        }

        // If the maximum is not even or there are no odd values, return 0
        if (max % 2 != 0 || !hasOdd) {
            return 0;
        }

        for(int value:a){
            if (value % 2 == 0 && value > minNonMaxEven && value != max) {
                minNonMaxEven = value;
            }
        }

        // Second pass: check that every odd value is greater than every even value that is not the max
        for (int value : a) {
            if (value % 2 == 1 && value <= minNonMaxEven) {
                return 0;
            }
        }

        // If all conditions are met, return 1
        return 1;
    }


}
