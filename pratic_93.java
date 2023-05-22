public class pratic_93 {
    public static void main(String[] args) {
        int[] a = {-1, 1, -8, -27, 8};
        System.out.println(isCubePerfect(a));
        int[] b = {27, 3};
        System.out.println(isCubePerfect(b));
        int[] c = {1, 1, 1, 1};
        System.out.println(isCubePerfect(c));
        int[] d = {64};
        System.out.println(isCubePerfect(d));
        int[] e = {63};
        System.out.println(isCubePerfect(e));
        int[] f = {-1, 0, 1};
        System.out.println(isCubePerfect(f));
        int[] g = {};
        System.out.println(isCubePerfect(g));
        int[] h = {3, 7, 21, 36};
        System.out.println(isCubePerfect(h));
    }

    static int isCubePerfect(int[] a) {
        for (int value : a) {
            if (!isPerfectCube(value)) {
                return 0;
            }
        }
        return 1;
    }

    static boolean isPerfectCube(int n) {
        int temp = (n<0)?-n:n;
        if (temp >= 0) {
            for (int i = 0; i * i * i <= temp; i++) {
                if (i * i * i == temp) {
                    return true;
                }
            }
        }
        return false;
    }

}
