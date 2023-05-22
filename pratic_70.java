public class pratic_70 {
    public static void main(String[] args){
        System.out.println(isLegalNumber(new int[]{1,0,1,1}, 2));
        System.out.println(isLegalNumber(new int[]{1,1,2}, 3));
        System.out.println(isLegalNumber(new int[]{3,2,5}, 8));
    }
    static int isLegalNumber(int[] a, int base){
        int len = a.length;
        int base10=0;
        int j=0;

        if(isLegal(a, base)==0) return -1;
        for(int i=len-1; i>=0; i--){
            base10 += Power(a[i], base, j);
            j++;
        }
        return base10;
    }
    static int Power(int n, int base, int i){
        int pow=1;
        for(int j=0; j<i; j++){
            pow *= base;
        }
        return (n*pow);
    }

    static int isLegal(int[] a, int base) {
        for (int number : a) {
            if (number >= base) {
                return 0;
            }
        }
        return 1;
    }
}
