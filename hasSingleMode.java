public class hasSingleMode {

    public static void main(String[] args) {
        int[] arr = {1, -29, 8, 5, -29, 6};
        System.out.println(hasSingleMode(arr)); // Output: 1
        int[] arr1 = {1, 2,3,4,2,4,7};
        System.out.println(hasSingleMode(arr1)); // Output: 0
        int[] arr2 = {1,2,3,4,6};
        System.out.println(hasSingleMode(arr2)); // Output: 0
        int[] arr3 = {7,1,2,1,7,4,2,7,7};
        System.out.println(hasSingleMode(arr3)); // Output: 1
    }

    static int hasSingleMode(int[] arr) {
        int maxCount = 0;
        int modeCount = 0;
        int currentModeValue = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                modeCount = 1;
                currentModeValue = arr[i];
            } else if (count == maxCount && arr[i] != currentModeValue) {
                modeCount++;
            }
        }

        return (modeCount == 1) ? 1 : 0;
    }

}
