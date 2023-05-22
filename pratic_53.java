public class pratic_53 {
    public static void main(String[] args){
        int[] arr = { 2,3,1,-6,8,-3,-1,2};
        System.out.print(nUpCount(arr, 5));
        int[] arr1 = { 6,3,1 };
        System.out.print(nUpCount(arr1, 0));
        int[] arr2 = { 1, 2, -1, 5, 3, 2, -3 };
        System.out.print(nUpCount(arr2, 20));
    }
    static int nUpCount(int []a, int n){
        if(a.length<1) return 0;
        int prevPairtialSum = 0;
        int currentPairtialSum = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            currentPairtialSum = prevPairtialSum + a[i];
            if (prevPairtialSum <= n && currentPairtialSum > n) {
                count++;
            }
            prevPairtialSum = currentPairtialSum;
        }
        return count;
    }
}
