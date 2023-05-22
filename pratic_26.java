public class pratic_26 {
    public static void main(String[] args){
        System.out.println(isMercurial(new int[]{1, 1, 2, 10, 3, 15, 1, 2, 2})); // Output: 0
        System.out.println(isMercurial(new int[]{5, 2, 10, 3, 15, 1, 2, 2})); // Output: 1
        System.out.println(isMercurial(new int[]{1, 2, 10, 3, 15, 16, 2, 2})); // Output: 1
        System.out.println(isMercurial(new int[]{3, 2, 18, 1, 0, 3, -11, 1, 3})); // Output: 0
        System.out.println(isMercurial(new int[]{2, 3, 1, 1, 18})); // Output: 1
        System.out.println(isMercurial(new int[]{8, 2, 1, 1, 18, 3, 5})); // Output: 1
        System.out.println(isMercurial(new int[]{3, 3, 3, 3, 3, 3})); // Output: 1
        System.out.println(isMercurial(new int[]{1})); // Output: 1
        System.out.println(isMercurial(new int[]{})); // Output: 1
    }
    static int isMercurial(int[] a) {
        boolean start = false;
        boolean foundThree = false;

        for(int i = 0; i < a.length; i++){
            if(a[i] == 1) {
                if(start && foundThree) {
                    return 0;
                }
                start = true;
                foundThree = false;
            } else if (a[i] == 3 && start) {
                foundThree = true;
            }
        }
        return 1;
    }
}
