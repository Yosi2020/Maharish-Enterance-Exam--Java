public class pratic_98 {
    public static void main(String[] args){
        System.out.println(isFinalArray(new int[] {4, 7, 9, 6, 5}));
        System.out.println(isFinalArray(new int[]  {4, 9, 6, 33}));
        System.out.println(isFinalArray(new int[] {3,8,15}));
    }
    static int isFinalArray(int[]a){
        for(int i=0; i<a.length; i++){
            if(isPrime(a[i])){
                boolean twinExists = false;
                for(int j=0; j<a.length; j++){
                    if(a[j]==a[i]-2 || a[j]==a[i]+2){
                        twinExists = true;
                    }
                }
                if(!twinExists) return 0;
            }
        }
        return 1;
    }

    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2; i< n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
