public class isMaxMinEqual {
    public static void main(String[] args) {
        int[] a = {11, 4, 9, 11, 8, 5, 4, 10};
        System.out.println(isMaxMinEqual(a));  // Output: 1
    }

    static int isMaxMinEqual(int[] a) {
        if (a.length < 2) {
            return 0;
        }

        int max = a[0];
        int min = a[0];
        int countMax = 0;
        int countMin = 0;

        for (int value : a) {
            if (value > max) {
                max = value;
                countMax = 1;
            } else if (value == max) {
                countMax++;
            }

            if (value < min) {
                min = value;
                countMin = 1;
            } else if (value == min) {
                countMin++;
            }
        }

        return (max != min && countMax == countMin) ? 1 : 0;
    }

}
