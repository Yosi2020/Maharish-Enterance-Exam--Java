public class pratic_31 {
    public static void main(String[] args){
        int [] a = {1,2,4,3,5};
        System.out.println(allEven(a, a.length));
        int [] b = {2, 4, 6, 8};
        System.out.println(allEven(b, b.length));
    }
    static int allEven(int [] a, int len){
        for(int i=0; i<len; i++){
            if(a[i]%2!=0) return 0;
        }
        return 1;
    }
}
