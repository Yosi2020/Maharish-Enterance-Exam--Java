public class pratic_74 {
    public static void main(String[] args){
        System.out.println(isStacked(10));
        System.out.println(isStacked(7));
        System.out.println(isStacked(15));
        System.out.println(isStacked(30));
    }

    static int isStacked(int n){
        int sum =0;
        int i=0;
        while(sum<=n){
            sum+=i;
            if (sum == n) {
                return 1;
            }
            i++;
        }
        return 0;
    }
}
