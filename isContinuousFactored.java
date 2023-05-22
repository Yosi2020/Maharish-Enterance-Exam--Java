public class isContinuousFactored {
    public static void main(String[] args){
        System.out.println(isContinuousFactored(90));
        System.out.println(isContinuousFactored(121));
        System.out.println(isContinuousFactored(2));
        System.out.println(isContinuousFactored(13));
        System.out.println(isContinuousFactored(6));
        System.out.println(isContinuousFactored(60));
        System.out.println(isContinuousFactored(120));
        System.out.println(isContinuousFactored(70));

    }
    public static int isContinuousFactored(int n) {
        for (int i = 2; i * i <= n; i++) {
            int product = i;
            int next = i + 1;
            while (product < n) {
                product *= next;
                next++;
            }
            if (product == n) {
                return 1;
            }
        }
        return 0;
    }

}
