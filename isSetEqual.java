public class isSetEqual {
    public static void main(String[] args){

    }
    public static int isSetEqual(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (!findElement(b, a[i])) {
                return 0;
            }
        }

        for (int i = 0; i < b.length; i++) {
            if (!findElement(a, b[i])) {
                return 0;
            }
        }
        return 1;
    }

    public static boolean findElement(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;
    }

}
