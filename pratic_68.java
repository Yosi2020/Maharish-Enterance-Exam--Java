public class pratic_68 {
    public static void main(String[] args) {
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 6)); // Output: 0
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 10)); // Output: 0
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 11)); // Output: 1
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 8)); // Output: 0
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 4)); // Output: 0
        System.out.println(isNUnique(new int[]{}, 4)); // Output: 0
    }

    static int isNUnique(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == n) {
                    count++;
                }
            }
        }
        return count == 1 ? 1 : 0;
    }
}
