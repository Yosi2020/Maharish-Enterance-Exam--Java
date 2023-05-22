public class isFancy {
    public static void main(String[] args){
        System.out.println(isFancy(5));
        System.out.println(isFancy(17));
        System.out.println(isFancy(61));
        System.out.println(isFancy(60));
    }
    static int isFancy(int n){
        int first = 1;
        int second =1;
        for(int i=0; i<n; i++){
            int fancy = 3*second + first*2;
            if(fancy==n){
                System.out.println("Fancy "+fancy);
                return 1;
            }
            first = second;
            second = fancy;
        }
        return 0;
    }
}
