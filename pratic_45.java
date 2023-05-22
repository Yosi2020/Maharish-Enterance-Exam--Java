public class pratic_45 {
    public static void main(String[] args){
        int [] a1 = {1,2,0,0,0,3,4};
        System.out.println(isHollow(a1));
        int [] a2 = {1,1,1,1,0,0,0,0,0,2,1,2,18};
        System.out.println(isHollow(a2));
        int [] a3 = {1,2,0,0,3,4};
        System.out.println(isHollow(a3));
        int [] a4 = {1,2,0,0,0,3,4, 5};
        System.out.println(isHollow(a4));
        int [] a5 = {3,8,3,0,0,0,3,3};
        System.out.println(isHollow(a5));
        int [] a6 = {1,2,0,0,0,3,4,0};
        System.out.println(isHollow(a6));
        int [] a7 = {0,1,2,0,0,0,3,4};
        System.out.println(isHollow(a7));
        int [] a8 = {0,0,0};
        System.out.println(isHollow(a8));
    }

    static int isHollow(int[] a) {
        int len = a.length;
        int nonZerosBefore = 0;
        int zeros = 0;
        int nonZerosAfter = 0;

        int i = 0;
        while (i < len && a[i] != 0) {
            nonZerosBefore++;
            i++;
        }

        while (i < len && a[i] == 0) {
            zeros++;
            i++;
        }

        while (i < len && a[i] != 0) {
            nonZerosAfter++;
            i++;
        }

        if (i == len && zeros >= 3 && nonZerosBefore == nonZerosAfter) {
            return 1;
        }

        return 0;
    }
}
