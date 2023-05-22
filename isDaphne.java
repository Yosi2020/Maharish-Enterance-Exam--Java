public class isDaphne {
    public static void main(String[] args) {
        System.out.println(isDaphne(new int[]{4, 8, 6, 3, 2, 9, 8, 11, 8, 13, 12, 12, 6})); // returns 1
        System.out.println(isDaphne(new int[]{2, 4, 6, 8, 6})); // returns 0
        System.out.println(isDaphne(new int[]{2, 8, 7, 10, -4, 6})); // returns 0
    }

    static int isDaphne(int[] a) {
        int countStart = 0, countEnd = 0, i = 0, j = a.length - 1;
        boolean containsOdd = false;

        while (i < a.length && a[i] % 2 == 0) {
            countStart++;
            i++;
        }

        while (j >= 0 && a[j] % 2 == 0) {
            countEnd++;
            j--;
        }

        for (int k : a) {
            if (k % 2 != 0) {
                containsOdd = true;
                break;
            }
        }

        return (countStart == countEnd && containsOdd) ? 1 : 0;
    }
}
