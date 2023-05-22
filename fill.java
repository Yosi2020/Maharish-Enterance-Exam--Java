public class fill {
    public static void main(String[] args){
        System.out.println(fill(new int[]{1,2,3,5, 9, 12,-2,-1}, 3, 10));
        System.out.println(fill(new int[]{4,2,-3,12}, 1, 5));
        System.out.println(fill(new int[]{2,6,9,0,-3}, 0, 4));
    }

    static int[] fill(int[] arr, int k, int n) {
        if (k <= 0 || n <= 0) {
            return null;
        }

        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = arr[i % k];
        }
        System.out.println("Example:- ");
        for(int value:arr2){
            System.out.println(value);
        }
        return arr2;
    }

}
