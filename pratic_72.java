public class pratic_72 {
    public static void main(String[] args){
        System.out.println(computeDepth(7));
        System.out.println(computeDepth(13));
        System.out.println(computeDepth(25));
    }
    public static int computeDepth(int n) {
        boolean[] digits = new boolean[10];
        int count = 0;
        for (int i = 1; ; i++) {
            int x = n * i;
            while (x > 0) {
                int digit = x % 10;
                if (!digits[digit]) {
                    digits[digit] = true;
                    count++;
                    if (count == 10) {
                        return i;
                    }
                }
                x /= 10;
            }
        }
    }

}
