public class pratic_3 {

    public static void main(String[] args){
        int [] a1 = {1,2,3,4,5};
        int [] a2 = {1, 3, 4, 2, 5};
        int [] a3 = {-5, -5, -4, -4, -4, -3, -3, -2, -2, -2};
        int [] a4 = {0, 1, 2, 3, 4, 5};
        int [] a5 = {1, 2, 3, 4};
        int [] a6 = {1, 2, 5};
        int [] a7 = {5,4,3,2,1};
        System.out.println(isSequencedArray(a1, 1,5));
        System.out.println(isSequencedArray(a2, 1,5));
        System.out.println(isSequencedArray(a3, -5,-2));
        System.out.println(isSequencedArray(a4, 1,5));
        System.out.println(isSequencedArray(a5, 1,5));
        System.out.println(isSequencedArray(a6, 1,5));
        System.out.println(isSequencedArray(a7, 1,5));
    }

    static int isSequencedArray(int[] a, int m, int n){
        if(a[0]!=m || a[a.length - 1]!=n) return 0;

        for(int i=0; i<a.length-1; i++){
            if(a[i+1]-a[i]!=0 && a[i+1]-a[i]!=1){
                return 0 ;
            }
        }
        return 1;
    }
}
