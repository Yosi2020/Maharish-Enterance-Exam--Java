public class goodSpread {
    public static void main(String[] args) {
        System.out.println(goodSpread(new int[] {2, 1, 2, 5, 2, 1, 5, 9}));  // returns 1
        System.out.println(goodSpread(new int[] {3, 1, 3, 1, 3, 5, 5, 3}));  // returns 0
    }

    static int goodSpread(int[] a) {
        int[] count = new int[100];
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
            if (count[a[i]] > 3) {
                return 0;
            }
        }
        return 1;
    }
}
