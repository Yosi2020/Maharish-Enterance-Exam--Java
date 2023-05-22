public class pratic_58 {
    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(0));  // should print 139
        System.out.println(findPorcupineNumber(138));  // should print 139
        System.out.println(findPorcupineNumber(139));  // should print 409
    }

    static int findPorcupineNumber(int n) {
        int number = n;
        boolean foundPorcupine = false;

        while(!foundPorcupine) {
            number++;
            if (isPrime(number) && number % 10 == 9) {
                System.out.println("Number - " +number);
                int nextPrime = number + 1;
                while (!isPrime(nextPrime)) {
                    nextPrime++;
                }
                System.out.println("next prime" + nextPrime);
                if (nextPrime % 10 == 9) {
                    foundPorcupine = true;
                }
            }
        }
        return number;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
