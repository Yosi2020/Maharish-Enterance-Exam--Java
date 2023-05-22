public class pratic_16 {
    public static void main(String[] args){
        int [] a1 = {1};
        System.out.println(isSystematicallyIncreasing(a1));
        int [] a2 = {1,1,2,1,2,3};
        System.out.println(isSystematicallyIncreasing(a2));
        int [] a3 = {1,1,2,1,2};
        System.out.println(isSystematicallyIncreasing(a3));
        int [] a4 = {1,2,1,2,1,2};
        System.out.println(isSystematicallyIncreasing(a4));
        int [] a5 = {1,2,3,1,2,1};
        System.out.println(isSystematicallyIncreasing(a5));
        int [] a6 = {1,1,2,3};
        System.out.println(isSystematicallyIncreasing(a6));
    }

    static int isSystematicallyIncreasing(int[] a){
        int current =1;
        int repeat = 0;
        for(int i=0; i<a.length; i++){
            repeat++;
            if(a[i]!=repeat){
                return 0;
            }
            if(repeat == current){
                current++;
                repeat=0;
            }
        }
        return (repeat == 0)?1:0;
    }
}
