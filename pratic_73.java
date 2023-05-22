public class pratic_73 {
    public static void main(String [] args){
        System.out.println(matches(new int[] {1,2,3,-5,-5,2,3,18}, new int [] {3,-2,3}));
    }
    static int matches(int[] a, int[] p) {
        int i = 0;  // index for a
        for (int n : p) {
            if (n > 0) {  // If n is positive, all elements in the sequence should be positive
                for (int j = 0; j < n; j++) {
                    if (a[i] <= 0) {
                        return 0;  // Found a non-positive number, pattern not matched
                    }
                    i++;
                }
            } else {  // If n is negative, all elements in the sequence should be negative
                for (int j = n; j < 0; j++) {
                    if (a[i] >= 0) {
                        return 0;  // Found a non-negative number, pattern not matched
                    }
                    i++;
                }
            }
        }
        return 1;  // All elements matched the pattern
    }

}
