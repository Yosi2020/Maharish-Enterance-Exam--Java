public class Pratic_2 {
    public static void main(String[] args){
        System.out.println(checkConcatenatedSum(198, 2));
        System.out.println(checkConcatenatedSum(198, 3));
        System.out.println(checkConcatenatedSum(2997, 3));
        System.out.println(checkConcatenatedSum(2997, 2));
        System.out.println(checkConcatenatedSum(13332, 4));
        System.out.println(checkConcatenatedSum(9, 1));
    }

    static int checkConcatenatedSum(int n, int cattlen){
        int val = 0;
        int orginial = n;
        while (n!=0){
            int digit = n%10;
            int concatSum = 0;
            for(int i = 0; i<cattlen; i++){
                concatSum = (concatSum*10) + digit;
            }
            val += concatSum;
            n /= 10;
        }
        if(val == orginial) return 1;
        return 0;
    }
}
