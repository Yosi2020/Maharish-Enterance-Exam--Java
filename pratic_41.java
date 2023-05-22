import java.awt.*;

public class pratic_41 {
    public static void main(String[] args){
        double x1 = 1.0;
        int [] a1 = {0, 1, 2, 3, 4};
        System.out.println(eval(x1, a1));
        double x2 = 3.0;
        int [] a2 = {3, 2, 1};
        System.out.println(eval(x2, a2));
        double x3 = 2.0;
        int [] a3 = {3, -2, -1};
        System.out.println(eval(x3, a3));
        double x4 = -3.0;
        int [] a4 = {3,2, 1};
        System.out.println(eval(x4, a4));
        double x5 = 2.0;
        int [] a5 = {3, 2};
        System.out.println(eval(x5, a5));
        double x6 = 2.0;
        int [] a6 = {4, 0, 9};
        System.out.println(eval(x6, a6));
        double x7 = 2.0;
        int [] a7 = {10};
        System.out.println(eval(x7, a7));
        double x8 = 10.0;
        int [] a8 = {0, 1};
        System.out.println(eval(x1, a1));
    }
    static double eval(double x, int [] a){
        int len = a.length;
        double sum = 0.0;
        for(int i = 0; i<len; i++){
            int power =1;
            for(int j =0; j<i; j++){
                power *=x;
            }
            double eyu = (i == 0)? a[i] : power*a[i];
            sum+=eyu;
        }
        return sum;
    }
}
