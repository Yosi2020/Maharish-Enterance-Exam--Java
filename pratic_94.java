public class pratic_94 {
    public static void main(String[] args) {
        System.out.println(countOnes(9));   // output: 2
        System.out.println(countOnes(5));   // output: 2
        System.out.println(countOnes(15));  // output: 4
    }

    static int countOnes(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }
            n = n / 2;
        }
        return count;
    }
}
