public class factorTwoCount {
    public static void main(String[] args){
        System.out.println(factorTwoCount(48));
        System.out.println(factorTwoCount(27));
    }
    static int factorTwoCount(int n){
        int count=0;
        while(true){
            if(n%2==0){
                count++;
                n/=2;
            }
            else{
                return count;
        }
    }
    }
}
