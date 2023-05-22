public class isComplete {
    public static void main(String[] args){
        System.out.println(isComplete(new int[]{5,7,9,13}));
        System.out.println(isComplete(new int[]{2,2}));
        System.out.println(isComplete(new int[]{2,6,3,4}));
        System.out.println(isComplete(new int[]{-5,6,2,3,2,4,5,11,8,7}));
    }
    public static int isComplete(int[] a) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean hasEven = false;

        for (int num : a) {
            if (num % 2 == 0) { // if the number is even
                hasEven = true;
                if(num < min) {
                    min = num;
                }
                if(num > max) {
                    max = num;
                }
            }
        }

        if (!hasEven || min == max) {
            return 0;
        }

        for (int i = min; i <= max; i++) {
            boolean found = false;
            for (int num : a) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return 0;
            }
        }

        return 1;
    }

}
