public class pratic_44 {
    public static void main(String[] args) {
        int[] a1 = {8, 9, 9, 5, 0};
        updateMileageCounter(a1, 1);
        printArray(a1); // {9, 9, 9, 5, 0}

        int[] a2 = {8, 9, 9, 5, 0};
        updateMileageCounter(a2, 2);
        printArray(a2); // {0, 0, 0, 6, 0}

        int[] a3 = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        updateMileageCounter(a3, 1);
        printArray(a3); // {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}

        int[] a4 = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        updateMileageCounter(a4, 13);
        printArray(a4); // {2, 1, 0, 0, 0, 0, 0, 0, 0, 0}
    }

    static void updateMileageCounter(int[] a, int miles) {
        for (int i = 0; i < miles; i++) {
            incrementMileage(a);
        }
    }

    static void incrementMileage(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 9) {
                a[i]++;
                break;
            } else {
                a[i] = 0;
            }
        }
    }

    static void printArray(int[] a) {
        for (int value : a) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
