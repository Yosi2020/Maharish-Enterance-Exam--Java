public class isAllPossibilities {
    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[]{1, 2, 0, 3})); // returns 1
        System.out.println(isAllPossibilities(new int[]{3, 2, 1, 0})); // returns 1
        System.out.println(isAllPossibilities(new int[]{1, 2, 4, 3})); // returns 0
        System.out.println(isAllPossibilities(new int[]{0, 2, 3})); // returns 0
        System.out.println(isAllPossibilities(new int[]{0})); // returns 1
        System.out.println(isAllPossibilities(new int[]{})); // returns 0
    }

    static int isAllPossibilities(int[] a) {
        if (a.length == 0) {
            return 0;
        }

        boolean[] isPresent = new boolean[a.length];
        for (int i : a) {
            if (i >= a.length || i < 0 || isPresent[i]) {
                return 0;
            }
            isPresent[i] = true;
        }

        return 1;
    }
}
