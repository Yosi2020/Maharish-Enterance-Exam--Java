public class pratic_19 {
    public static void main(String[] args){
        System.out.println(isHodder(3)); // Output: 1
        System.out.println(isHodder(7)); // Output: 1
        System.out.println(isHodder(31)); // Output: 1
        System.out.println(isHodder(127)); // Output: 1
        System.out.println(isHodder(10)); // Output: 0
    }

    static int isHodder(int n){
        if(n<=1 || !isPrime(n)) {
            return 0;
        }

        int j=1;
        while(true){
            int hodderCandidate = powerOfTwo(j)-1;
            if (hodderCandidate == n) return 1;
            else if (hodderCandidate > n) return 0;
            j++;
        }
    }

    static int powerOfTwo(int a){
        int result = 1;
        for(int i=0; i<a; i++){
            result *= 2;
        }
        return result;
    }

    static boolean isPrime(int n){
        if(n<=1) return false;

        for(int i=2; i<n; i++){
            if(n%i ==0) return false;
        }
        return true;
    }
}
