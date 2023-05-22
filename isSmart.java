public class isSmart {
    public static void main(String[] args) {
        System.out.println(isSmart(22));
        System.out.println(isSmart(11));
        System.out.println(isSmart(8));
    }

    static int isSmart(int n) {
        int sum = 1;
        for(int i=0; i<n; i++){
            sum += i;
            if(sum == n){
                return 1;
            }
//            System.out.println(sum);
        }
        return 0;
    }
}
