public class pratic_30 {
    public static void main(String[] args){
        int[] a = {1, 4, 1, 4, 5, 6};
        int n = 5;
        System.out.println(isPairedN(a, n)); // Output: 1

        int[] b = {1, 4, 1, 4, 5, 6};
        n = 6;
        System.out.println(isPairedN(b, n)); // Output: 1

        int[] c = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        n = 6;
        System.out.println(isPairedN(c, n));

        int[] d = {1, 4, 1};
        n = 5;
        System.out.println(isPairedN(d, n));

        int[] e = {8, 8, 8, 8, 7, 7, 7};
        n = 15;
        System.out.println(isPairedN(e, n));

        int[] g = {8, -8, 8, 8, 7, 7, -7};
        n = -15;
        System.out.println(isPairedN(g, n));

        int[] h = {3};
        n = 3;
        System.out.println(isPairedN(h, n));

        int[] i = {};
        n = 0;
        System.out.println(isPairedN(i, n));
    }
    static int isPairedN(int a[], int n){
        if( a.length < 2 || n == 0) return 0;
        for(int i = 0; i<a.length; i++){
            for(int j = 1; j<a.length; j++){
                if(a[i]+a[j]==n && i+j==n){
                    return 1;
                }
            }
        }
        return 0;
    }
}
