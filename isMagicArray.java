public class isMagicArray {
    public static void main(String[] args){
        System.out.println(isMagicArray(new int[]{
                21,3,7,11,4,6}));
        System.out.println(isMagicArray(new int[]{
                13,4,4,4,4}));
        System.out.println(isMagicArray(new int[]{
                10,5,5}));
        System.out.println(isMagicArray(new int[]{
                0,6,8,20}));
        System.out.println(isMagicArray(new int[]{
                8,5,-5,5,3}));
        System.out.println(isMagicArray(new int[]{
                3}));
    }

    public static int isMagicArray(int[] a) {
        int primeSum = 0;

        for (int i = 1; i < a.length; i++) { // start from the second element
            if (isPrime(a[i])) {
                primeSum += a[i];
            }
        }

        if (primeSum == 0 && isPrime(a[0])) {
            return 1;
        }

        return primeSum == a[0] ? 1 : 0;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
