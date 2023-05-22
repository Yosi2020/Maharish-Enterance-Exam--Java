public class pratic_90 {
    public static void main(String[] args){
        System.out.println(isFactorial(2));
        System.out.println(isFactorial(3));
        System.out.println(isFactorial(7));
        System.out.println(isFactorial(8));
        System.out.println(isFactorial(11));
        System.out.println(isFactorial(721));
    }
    static int isFactorial(int n){
        if(n<2) return 0;

        for (int i = 1; i<n; i++){
            if(Factorial(i)+1 == n && isPrime(n)){
                System.out.println("Factorial "+i);
                return 1;
            }
        }
        return 0;
    }

    static boolean isPrime(int n){
        if(n<2) return false;

        for(int i=2; i<n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    static int Factorial(int num){
        int factor = 1;
        for(int i = num; i>0; i--){
            factor *= i;
        }
        return factor;
    }
}
