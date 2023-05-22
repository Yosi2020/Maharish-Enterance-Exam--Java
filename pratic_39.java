public class pratic_39 {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 1};
        System.out.println(hasNValues(a, 2));
        int[] b = {1, 1, 1, 8, 1, 1, 1, 3, 3};
        System.out.println(hasNValues(b, 3));
        int[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(hasNValues(c, 10));
        int[] d = {1, 2, 2, 1};
        System.out.println(hasNValues(d, 3));
        int[] e = {1, 1, 1, 8, 1, 1, 1, 3, 3};
        System.out.println(hasNValues(e, 2));
        int[] f = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(hasNValues(f, 20));
    }

    static int hasNValues(int[] a, int n) {
        int[] uniqueValues = new int[n];
        int uniqueCount = 0;

        for (int value : a) {
            boolean isNewValue = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (value == uniqueValues[j]) {
                    isNewValue = false;
                    break;
                }
            }

            if (isNewValue) {
                if (uniqueCount == n) {
                    return 0;
                }
                uniqueValues[uniqueCount++] = value;
            }
        }

        return (uniqueCount == n) ? 1 : 0;
    }
}
