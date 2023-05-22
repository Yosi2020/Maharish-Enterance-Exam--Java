public class isBean {

    public static void main(String[] args) {
        System.out.println(isBean(new int[]{4, 9, 8}));  // returns 1
        System.out.println(isBean(new int[]{2, 2, 5, 11, 23}));  // returns 1
        System.out.println(isBean(new int[]{7, 7, 3, 6}));  // returns 1
        System.out.println(isBean(new int[]{0}));  // returns 1
        System.out.println(isBean(new int[]{3, 8, 4}));  // returns 0
    }

    static int isBean(int[] a) {
        for (int num : a) {
            if (!contains(a, num * 2) && !contains(a, num * 2 + 1) && !contains(a, num / 2)) {
                return 0;
            }
        }
        return 1;
    }

    static boolean contains(int[] a, int target) {
        for (int num : a) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
