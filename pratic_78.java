public class pratic_78 {
    public static void main(String[] agrs){
        System.out.println(isTrivalent(new int[] {22, 19, 10, 10, 19, 22, 22, 10}));
        System.out.println(isTrivalent(new int[] {1, 2, 2, 2, 2, 2, 2}));
        System.out.println(isTrivalent(new int[] {2, 2, 3, 3, 3, 3, 2, 41, 65}));
        System.out.println(isTrivalent(new int[] {-1, 0, 1, 0, 0, 0}));
        System.out.println(isTrivalent(new int[] {}));
        System.out.println(isTrivalent(new int[] {2147483647, -1, -1, -2147483648}));

    }
    static int isTrivalent(int[] a) {
        if (a.length < 3)
            return 0;

        int val1 = a[0];
        int val2 = a[1];
        int val3 = a[2];

        for (int i = 0; i < a.length; i++) {
            if (a[i] != val1 && a[i] != val2 && a[i] != val3) {
                if (val2 == val1) {
                    val2 = a[i];
                } else if (val3 == val1 || val3 == val2) {
                    val3 = a[i];
                } else {
                    return 0;
                }
            }
        }

        return ((val1 != val2 && val1 != val3) && (val2 != val1 && val2 != val3) && (val3 != val1 && val3 != val2)) ?1:0;
    }
}
