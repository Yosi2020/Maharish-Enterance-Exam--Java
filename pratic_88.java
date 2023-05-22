public class pratic_88 {
    public static void main(String[] args){
        System.out.println(getExponent(27, 3));
        System.out.println(getExponent(28, 3));
        System.out.println(getExponent(280, 7));
        System.out.println(getExponent(-250, 5));
        System.out.println(getExponent(18, 1));
        System.out.println(getExponent(128, 4));
    }
    static int getExponent(int n, int p){
        if(p==1) return -1;
        int count = 0;
        while (true){
            if(n%p==0){
                count++;
                n/=p;
            }
            else return count;
        }
    }
}
