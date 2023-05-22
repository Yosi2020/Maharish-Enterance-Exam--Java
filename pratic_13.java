public class pratic_13 {
    public static void main(String[] args){
        int[] array1 = {1, 2, 19, 4, 5};
        int[] array2 = {1, 2, 3, 4, 15};
        int[] array3 = {1, 2, 9, 8};
        int[] array4 = {2};
        int[] array5 = {};
        int[] array6 = {-2,5,0,5,12};

        System.out.println(isOnionArray(array1)); // Output: 1
        System.out.println(isOnionArray(array2));// Output: 0
        System.out.println(isOnionArray(array3));
        System.out.println(isOnionArray(array4));
        System.out.println(isOnionArray(array5));
        System.out.println(isOnionArray(array6));
    }

    static int isOnionArray(int[] a){
        int length = a.length;
        for(int i=0; i<length/2; i++){
            int complementLength = length - i -1;
            if((a[i] + a[complementLength])>10){
                return 0;
            }
        }
        return 1;
    }
}
