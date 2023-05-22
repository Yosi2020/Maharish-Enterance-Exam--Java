public class isWave {
    public static void main(String[] args){
        System.out.println(isWave(new int[]{7,2,9,10,5}));
        System.out.println(isWave(new int[]{4, 11, 12, 1, 6}));
        System.out.println(isWave(new int[]{1,0,5}));
        System.out.println(isWave(new int[]{2}));
        System.out.println(isWave(new int[]{2,6,3,4}));
    }
    static int isWave(int[] a){
        int len = a.length-1;
        for(int i=0; i<len; i++){
            if(a[i]%2==0 && a[i+1]%2==0 || a[i]%2==1 && a[i+1]%2==1){
                return 0;
            }
        }
        return 1;
    }
}
