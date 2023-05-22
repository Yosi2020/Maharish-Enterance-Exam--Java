public class pratic_34 {
    public static void main(String[] args){
        int [] a={2,1,18, -5};
        System.out.println(pairwiseSum(a));
        int [] b={2,1,18, -5, -5, -15, 0, 0, 1,-1};
        System.out.println(pairwiseSum(b));
        int [] c={2,1,18};
        System.out.println(pairwiseSum(c));
        int [] d={};
        System.out.println(pairwiseSum(d));
    }
    static int[] pairwiseSum(int[] a){
        if(a.length%2!=0 || a.length < 2) return null;

        int [] arr = new int[a.length/2];
        for(int i=0; i<a.length/2; i++){
            arr[i] = a[i*2] + a[(i*2)+1];
        }
        System.out.println("Example");
        for(int i: arr){
            System.out.println(i);
        }
        return arr;
    }
}
