public class pratic_81 {
    public static void main(String[] args) {
        System.out.println(isMinMaxDisjoint(new int[]{5, 4, 1, 3, 2})); // Output: 1
        System.out.println(isMinMaxDisjoint(new int[]{18, -1, 3, 4, 0})); // Output: 0
        System.out.println(isMinMaxDisjoint(new int[]{9, 0, 5, 9})); // Output: 0
        System.out.println(isMinMaxDisjoint(new int[]{0, 5, 18, 0, 9})); // Output: 0
        System.out.println(isMinMaxDisjoint(new int[]{7, 7, 7, 7})); // Output: 0
        System.out.println(isMinMaxDisjoint(new int[]{})); // Output: 0
        System.out.println(isMinMaxDisjoint(new int[]{1, 2})); // Output: 0
        System.out.println(isMinMaxDisjoint(new int[]{1})); // Output: 0
    }

    static int isMinMaxDisjoint(int[] a) {
        if (a.length < 2) {
            return 0;
        }

        int min = a[0], max = a[0];
        int minIndex = 0, maxIndex = 0;
        int minCount = 1, maxCount = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
                minCount = 1;
            } else if (a[i] == min) {
                minCount++;
            }

            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
                maxCount = 1;
            } else if (a[i] == max) {
                maxCount++;
            }
        }

        return (min == max || minCount > 1 ||
                maxCount > 1 || ((minIndex - maxIndex)<0
                ? -(minIndex-maxIndex):
                (minIndex-maxIndex)) == 1) ? 0 : 1;
    }
}

