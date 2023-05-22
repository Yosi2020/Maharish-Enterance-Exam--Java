public class isTwinoid {

    public static int isTwinoid(int[] a) {
        int evenCount = 0;

        for (int i = 0; i < a.length - 1; i++) {
            // if current and next number are even
            if (a[i] % 2 == 0 && a[i+1] % 2 == 0) {
                evenCount++;

                // If there's a third adjacent even number, it's not a twinoid
                if (i < a.length - 2 && a[i+2] % 2 == 0) {
                    return 0;
                }

                i++; // skip next index as it's already checked
            }
        }

        if (evenCount == 1) return 1;

        return 0;
    }

}
