public class pratic_33 {
    public static void main(String[] args){
        int[] a = {1, 2, 1};
        System.out.println(is121Array(a)); // Output: 1

        int[] b = {1, 1, 2, 2, 2, 1, 1};
        System.out.println(is121Array(b)); // Output: 0

        int[] c = {1, 1, 2, 2, 2, 1, 1, 1};
        System.out.println(is121Array(c)); // Output: 0

        int[] d = {1, 1, 2, 2, 2, 1, 1, 1, 3};
        System.out.println(is121Array(d)); // Output: 0

        int[] e = {1,1,1,1,1,1};
        System.out.println(is121Array(e)); // Output: 0

        int[] f = {2,2,2,1, 1,1, 2, 2, 2, 1, 1, 1};
        System.out.println(is121Array(f)); // Output: 0

        int[] g = {1,1,1, 2,2,2, 1,1,1,2,2};
        System.out.println(is121Array(g)); // Output: 0

        int[] h = {2, 2, 2};
        System.out.println(is121Array(h)); // Output: 0
    }
    public static int is121Array(int[] a) {
        int count1 = 0, count2 = 0, j = a.length - 1;
        boolean isCount2Started = false;

        for (int i = 0; i <= j; i++) {
            if (a[i] != a[j]) {
                return 0;
            }
            if (a[0] != 1 && a[a.length - 1] != 1) {
                return 0;
            }
            if (a[i] == 1 && a[j] == 1) {
                count1++;

            }
            if (a[i] == 2 && a[j] == 2) {
                isCount2Started = true;
                count2++;
            }
            j--;
        }
        System.out.println("Count-1 "+count1 +" Count-2 "+count2);
        return (count1 > 0 && count2 > 0 && isCount2Started) ?1:0;
    }
}
