public class pratic_86 {
    public static void main(String[] args) {
        System.out.println(isPacked(new int[]{2, 2, 1})); // Output: 1
        System.out.println(isPacked(new int[]{2, 2, 1, 2, 2})); // Output: 0
        System.out.println(isPacked(new int[]{4, 4, 4, 4, 1, 2, 2, 3, 3, 3})); // Output: 1
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7, 1})); // Output: 1
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 1, 7, 7, 7})); // Output: 0
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7})); // Output: 1
        System.out.println(isPacked(new int[]{})); // Output: 1
        System.out.println(isPacked(new int[]{1, 2, 1})); // Output: 0
        System.out.println(isPacked(new int[]{2, 1, 1})); // Output: 0
        System.out.println(isPacked(new int[]{-3, -3, -3})); // Output: 0
        System.out.println(isPacked(new int[]{0, 2, 2})); // Output: 0
        System.out.println(isPacked(new int[]{2, 1, 2})); // Output: 0
    }

    public static int isPacked(int[] a) {
        if (a.length == 0) {
            return 1;
        }

        int[] occurrence = new int[101]; // Assuming the values do not exceed 100.
        int current = a[0];
        int count = 0;

        for (int value : a) {
            if (value < 1 || occurrence[value] > 0) {
                return 0;
            }
            if (value == current) {
                count++;
                if (count > current) {
                    return 0;
                }
            } else {
                if (count != current) {
                    return 0;
                }
                occurrence[current] = 1; // Mark that current value has occurred.
                current = value;
                count = 1;
            }
        }
        return count == current ? 1 : 0;
    }


}
