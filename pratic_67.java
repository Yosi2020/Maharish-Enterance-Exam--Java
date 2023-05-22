public class pratic_67 {
    public static void main(String[] args){
        int a1[] = {3,3,6,36};
        int d1 =3;
        System.out.println(isDivisible(a1, d1));
        int a2[] = {4};
        int d2 =2;
        System.out.println(isDivisible(a2, d2));
        int a3[] = {3,4,3,6,36};
        int d3 =3;
        System.out.println(isDivisible(a3, d3));
        int a4[] = {6,12,24,36};
        int d4 =12;
        System.out.println(isDivisible(a4, d4));
        int a5[] = {};
        int d5 =3;
        System.out.println(isDivisible(a5, d5));
    }

    static int isDivisible(int[] a, int divisor){
        if(a.length ==0) return 1;
        for(int i =0; i<a.length; i++){
            if(a[i]%divisor!=0) return 0;
        }
        return 1;
    }
}
