public class pratic_97 {
    public static void main(String[] args){
        System.out.println(isDigitSum(32121, 9));
        System.out.println(isDigitSum(13, 6));
        System.out.println(isDigitSum(3, 3));
        System.out.println(isDigitSum(32121, 10));
    }

    public static int isDigitSum(int n, int m) {
        // return -1 if either argument is negative
        if (n < 0 || m < 0) {
            return -1;
        }

        // calculate the sum of the digits
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        // return 1 if the sum of the digits is less than m, 0 otherwise
        if (sum < m) {
            return 1;
        } else {
            return 0;
        }
    }

}
