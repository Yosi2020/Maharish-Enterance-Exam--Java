public class lastEven {
    public static int lastEven(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                return i;
            }
        }
        return -1;
    }

}
