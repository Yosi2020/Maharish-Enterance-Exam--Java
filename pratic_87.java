public class pratic_87 {
    public static void main(String[] args){
        int[][] testArrays = {
                {1},
                {2},
                {1,1,1,1,1,1},
                {3,3,3,3,3,3},
                {2,4,6,8,11},
                {-2,-4,-6,-8,-11}
        };

        for (int[] testArray : testArrays) {
            System.out.println(isOddHeavy(testArray));
        }
    }
    static int isOddHeavy(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0 && a[i] > maxOdd) {
                maxOdd = a[i];
            } else if (a[i] % 2 == 0 && a[i] < minEven) {
                minEven = a[i];
            }
        }

        // If there are no odd numbers, return 0
        if (maxOdd == Integer.MIN_VALUE) {
            return 0;
        }

        // If there are no even numbers, return 1 because any odd number is greater than all even numbers
        if (minEven == Integer.MAX_VALUE) {
            return 1;
        }

        // Return whether the maximum odd number is greater than the minimum even number
        return (maxOdd > minEven) ? 1 : 0;
    }

}
