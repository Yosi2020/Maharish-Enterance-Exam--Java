public class pratic_37 {
    public static void main(String[] args){
        int[] a = {1, 2, 3};
        System.out.println(loopSum(a, 2));
        int[] b = {-1, 2, -1};
        System.out.println(loopSum(b, 7));
        int[] c = {1, 4, 5, 6};
        System.out.println(loopSum(c, 4));
        int[] d = {3};
        System.out.println(loopSum(d, 10));
    }
    static int loopSum(int a[], int n){
        int j = 0, sum=0;
        for(int i=0; i<n; i++){
            sum += a[j];
            if(j<a.length-1){
                j++;
            } else{
                j=0;
            }
        }
        return sum;
    }
}
