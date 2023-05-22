public class pratic_12 {
    public static void main(String[] args){
        int [] a1 = {1};
        System.out.println(decodeArray(a1));
        int [] a2 = {0,1};
        System.out.println(decodeArray(a2));
        int [] a3 = {-1,0,1};
        System.out.println(decodeArray(a3));
        int [] a4 = {0, 1, 1, 1, 1, 1, 0, 1};
        System.out.println(decodeArray(a4));
        int [] a5 = {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1};
        System.out.println(decodeArray(a5));
    }

    public static int decodeArray(int[] a) {
        int n = a.length;   // length of array
        int sign = 1;    // sign of my array which means positive or negative number
        int i = 0;      // loop starting index
        int num = 0;     // contacting number

        // check for negative number encoding
        if (a[0] == -1) {
            sign = -1;
            i = 1;
        }

        // decode the digits from 0 to 1
        while (i < n-2 && a[i] == 0 && a[i+1]!=0) {
            if(a[i] ==0 && a[i+1] ==1){
                num= num*10 + 1;
            }
            i++;
        }

        // decode the 1 into 0
        while (i < n - 2 && a[i] == 1) {
            if(a[i] !=0 && a[i+1] !=1){
                num= num*10 + 0;
            }
            else if(a[i + 1] ==1 && a[i+2] ==1){
                num= num*10 + 0;
            }
            i++;
        }

        // counting 0 and return the number
        while (i < n) {
            int count = 0;

            while (i < n && a[i] == 0) {
                count++;
                i++;
            }

            num = num * 10 + count;
            i++;
        }

        return sign * num;
    }

}
