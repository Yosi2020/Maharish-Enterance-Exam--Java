public class pratic_95 {
    public static void main(String[] args) {
        int[] a = {9, 3, 4, 9, 1};
        System.out.println(isOddValent(a));  // output: 1
        int[] b = {1, 2, 3, 4, 5};
        System.out.println(isOddValent(b));  // output: 0
        int[] c = {2, 2, 2, 4, 4};
        System.out.println(isOddValent(c));  // output: 0
    }

    static int isOddValent(int[] a) {
        boolean hasOdd = false;
        boolean hasDuplicate = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                hasOdd = true;
            }
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    hasDuplicate = true;
                    break;
                }
            }
            if (hasOdd && hasDuplicate) {
                return 1;
            }
        }
        return 0;
    }
}
