class largestAdjacentSum {
    public static void main(String[] args) {
        int[] a = {1,1,1,1,2,1,1,1};
        int result = largestAdjacentSum(a);
        System.out.println(result);
    }

    static int largestAdjacentSum(int[] a) {
        int c;
        int d = 0;
        for (int i = 0; i < a.length - 1; i++) { // Change the loop condition to i < a.length - 1
            c = a[i] + a[i + 1];
            if (c > d) {
                d = c;
            }
        }
        return d;
    }
}
