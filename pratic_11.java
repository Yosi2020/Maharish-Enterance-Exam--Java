public class pratic_11 {
    public static void main(String[] args){
        System.out.println(isDigitIncreasing(7));
        System.out.println(isDigitIncreasing(36));
        System.out.println(isDigitIncreasing(984));
        System.out.println(isDigitIncreasing(7404));
        System.out.println(isDigitIncreasing(11));
    }
    public static int isDigitIncreasing(int n) {
        for(int i=1; i<10; i++){
            int sum = 0;
            int concat = 0;
            while(sum < n){
                concat = concat*10 + i;
                sum += concat;
                if(sum == n){
                    return 1;
                }
            }
        }
        return 0;
    }
}
