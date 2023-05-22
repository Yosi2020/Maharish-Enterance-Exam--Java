public class pratic_17 {
    public static void main(String[] args){
        System.out.println(isFactorialPrime(2));
        System.out.println(isFactorialPrime(3));
        System.out.println(isFactorialPrime(7));
        System.out.println(isFactorialPrime(8));
        System.out.println(isFactorialPrime(11));
        System.out.println(isFactorialPrime(721));
    }

    static int isFactorialPrime(int n){
        if(n <= 1) return 0;

        int factorial =1;
        int i=1;

        while(factorial+1 <= n){
            if(factorial+1 ==n && isPrime(n)){
                return 1;
            }
            i++;
            factorial *= i;
        }
        return 0;
    }

    static boolean isPrime(int num){
        if (num <= 1) return false;

        for (int j = 2; j < num; j++){
            if(num%j == 0){
                return false;
            }
        }
        return true;
    }
}
