public class pratic_65 {
    public static void main(String[] args) {
        int[][] testArrays = {
                {3, 2, 10, 4, 1, 6, 9},
                {2, 10, 4, 1, 6, 9},
                {3, 2, 10, 4, 1, 6},
                {1, 1, 8, 3, 1, 1},
                {9, 15, 6},
                {1, 1, 2, 2, 1, 1},
                {1, 1, 15, -1, -1}
        };

        for (int[] testArray : testArrays) {
            System.out.println(isCentered15(testArray));
        }
    }

    static int isCentered15(int[] a) {
        for(int i = 1; i< a.length-i; i++){
            int sum = 0;
            for(int j = i; j<a.length-i; j++){
                sum += a[j];
            }
            if(sum == 15) return 1;
        }
        return 0;
    }
}
