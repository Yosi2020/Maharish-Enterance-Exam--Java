import java.util.*;

public class pratic_5 {
        public static void main(String[] args) {
            System.out.println(encodeNumber(2));
            System.out.println(encodeNumber(6));
            System.out.println(encodeNumber(14));
            System.out.println(encodeNumber(24));
            System.out.println(encodeNumber(1200));
            System.out.println(encodeNumber(1));
            System.out.println(encodeNumber(-18));
        }
        static int []  encodeNumber(int n){
            if (n<=1) return null;

            int number=n;
            int counter =0;
            for (int i = 2; i <= n; i++) {
                while (n % i == 0) {
                    n/= i;
                    counter++;
                }
            }
            int index=0;
            int [] arr = new int[counter];
            for(int i=2;i<=number;i++){
                if(number%i==0)
                {
                    arr[index]=i;
                    number/=i;
                    i--;
                    index++;
                }
            }
            for(int r:arr){
                System.out.println(r);
            }
            return arr;
        }
    }



