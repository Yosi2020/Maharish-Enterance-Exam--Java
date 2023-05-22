public class pratic_85 {
    public static void main(String[] args){
        System.out.println(fullnessQuotient(1));
        System.out.println(fullnessQuotient(9));
        System.out.println(fullnessQuotient(360));
        System.out.println(fullnessQuotient(-4));
        System.out.println(fullnessQuotient(96));
        System.out.println(fullnessQuotient(94));
    }

    static int fullnessQuotient(int n){
        if(n < 0) return -1;
        int count = 0;
        for(int i=2; i<10; i++){
            if(isfullyDivisble(n, i)){
                count++;
            }
        }
        return count;
    }
    static boolean isfullyDivisble(int n, int k){
        while(n!=0){
            int reminder = n%k;
            if(reminder == 0) return false;
            n/=k;
        }
        return true;
    }
}
