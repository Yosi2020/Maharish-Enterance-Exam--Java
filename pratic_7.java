public class pratic_7 {
    public static void main(String[] args){
        int [] a1 = {1, 2, 3, 4, 5};
        int n1 = 2;
        doIntegerBasedRouding(a1, n1);
        int [] a2 = {1, 2, 3, 4, 5} ;
        int n2 = 3;
        doIntegerBasedRouding(a2, n2);
        int [] a3 = {1, 2, 3, 4, 5};
        int n3 = -3;
        doIntegerBasedRouding(a3, n3);
        int [] a4 = {-1, -2, -3, -4, -5} ;
        int n4 = 3;
        doIntegerBasedRouding(a4, n4);
        int [] a5 = {-18, 1, 2, 3, 4, 5} ;
        int n5 = 4;
        doIntegerBasedRouding(a5, n5);
        int [] a6 = {1, 2, 3, 4, 5};
        int n6 = 5;
        doIntegerBasedRouding(a6, n6);
        int [] a7 = {1, 2, 3, 4, 5};
        int n7 = 100;
        doIntegerBasedRouding(a7, n7);
    }

    public static void doIntegerBasedRouding(int[] a, int n) {
        if (n >= 0) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                int quotient = a[i] / n;
                int remainder = a[i] % n;
                int rounded = quotient * n;
                if (remainder * 2 >= n) {
                    rounded += n;
                }
                a[i] = rounded;
            }
        }
        }
        System.out.println("Example");
        for(int i: a){
            System.out.println(i);
        }
    }
}
