public class isSym {
    public static int isSym(int[] a) {
        int i = 0, j = a.length - 1;

        while (i <= j) {
            // If parity of both ends are not the same, return 0
            if (a[i] % 2 != a[j] % 2) {
                return 0;
            }
            i++;
            j--;
        }

        // All elements' parities are the same from both ends
        return 1;
    }

}
