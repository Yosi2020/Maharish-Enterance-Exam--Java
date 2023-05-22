public class pratic_36 {
    public static void main(String[] args){
        int[] a ={36, -28};
        System.out.println(isComplete(a));
        int[] b ={36, 28};
        System.out.println(isComplete(b));
        int[] c ={4};
        System.out.println(isComplete(c));
        int[] d ={3,2,1,1,5,6};
        System.out.println(isComplete(d));
        int[] e ={3,7,23,13,107, -99, -97, 81};
        System.out.println(isComplete(e));
    }

    static int isComplete(int[] a) {
        boolean hasEven = false;
        boolean hasPerfectSquare = false;
        boolean hasSum8 = false;

        for (int num : a) {
            // Check for even number
            if (num % 2 == 0) {
                hasEven = true;
            }
            // Check for perfect square
            if (isPerfectSquare(num)) {
                hasPerfectSquare = true;
                System.out.println("Prefect square: "+num);
            }
            // Check for sum of 8
            for (int otherNum : a) {
                if (num != otherNum && num + otherNum == 8) {
                    hasSum8 = true;
                    break;
                }
            }

            // If all conditions are met, return 1
            if (hasEven && hasPerfectSquare && hasSum8) {
                return 1;
            }
        }

        // If any condition is not met, return 0
        return 0;
    }

    // Check if a number is a perfect square
    static boolean isPerfectSquare(int n) {
        if (n < 0) return false;
        if (n == 1 || n == 0) return true;
        for (int i = 2; i <= n / 2; i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }
}
