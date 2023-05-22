import java.awt.*;

public class pratic_32 {
    public static void main(String[] args){
        int [] a1 = {5, 15, 27};
        int n = 2;
        System.out.println(isNPrimeable(a1, n));
        int [] a2 = {5, 15, 27};
        int n1 = 3;
        System.out.println(isNPrimeable(a2, n1));
        int [] a3 = {5, 15, 26};
        int n2 = 2;
        System.out.println(isNPrimeable(a3, n2));
        int [] a4 = {1, 1, 1, 1, 1, 1, 1};
        int n3 = 4;
        System.out.println(isNPrimeable(a4, n3));
        int [] a5 = {};
        int n4 = 2;
        System.out.println(isNPrimeable(a5, n4));
    }

    static int isNPrimeable(int[]a, int n){
        for (int i:a){
            if (!isPrime(i+n)){
                return 0;
            }
//            System.out.println("A+i = "+a[i]+n);
        }
        return 1;
    }
    static boolean isPrime(int eyu){
        if(eyu<2) return false;
        for(int i = 2; i<eyu; i++){
            if(eyu%i==0) return false;
        }
        return true;
    }
}
