public class pratic_48 {
    public static void main(String[] args){
        int [] a1= {1,2,3,4};
        System.out.println(largestAdjacentSum(a1));
        int [] a2= {18,-12,9,-10};
        System.out.println(largestAdjacentSum(a2));
        int [] a3= {1,1,1,1,1,1,1,1,1};
        System.out.println(largestAdjacentSum(a3));
        int [] a4= {1,1,1,1,1,2,1,1,1};
        System.out.println(largestAdjacentSum(a4));

    }
    static int largestAdjacentSum(int a[]){
        int max = 0;
        for(int i=0; i<a.length-1; i++){
            if((a[i]+a[i+1])>max){
                max = a[i]+a[i+1];
            }
        }
        return max;
    }
}
