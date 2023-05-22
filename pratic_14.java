public class pratic_14 {
    public static void main(String[] args){
        System.out.println(isPrimeHappy(5));
        System.out.println(isPrimeHappy(25));
        System.out.println(isPrimeHappy(32));
        System.out.println(isPrimeHappy(8));
        System.out.println(isPrimeHappy(2));

    }

    public static int isPrimeHappy(int n) {
        if (n <= 2) {
            return 0;
        }

        int sum = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println("Sum:- "+sum);

        return sum % n == 0 ? 1 : 0;
    }

    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i = 2; i<n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
