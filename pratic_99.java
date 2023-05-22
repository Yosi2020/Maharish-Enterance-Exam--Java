public class pratic_99 {
    public static void main(String[] args){
        System.out.println(isBalanced(new int[]{}));
    }

    public static int isBalanced(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean found = false;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == -a[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) return 0;
        }
        return 1;
    }

}
