public class pratic_18 {
    public static void main(String[] args){
        int []a1 = {1,3,5,9};
        System.out.println(largestDifferenceOfEvens(a1));
        int []a2 = {1,18,5,7, 33};
        System.out.println(largestDifferenceOfEvens(a2));
        int []a3 = {2,2,2,2};
        System.out.println(largestDifferenceOfEvens(a3));
        int []a4 = {1,2,1,2,1,4,1,6,4};
        System.out.println(largestDifferenceOfEvens(a4));
    }

    public static int largestDifferenceOfEvens(int[] a) {
        int maxEven = 0, minEven = 0, evenCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                if (evenCount == 0) {
                    minEven = maxEven = a[i];
                }
                evenCount++;
                if (a[i] > maxEven) {
                    maxEven = a[i];
                }
                if (a[i] < minEven) {
                    minEven = a[i];
                }
            }
        }

        if (evenCount > 1) {
            return maxEven - minEven;
        } else {
            return -1;
        }

    }
}
