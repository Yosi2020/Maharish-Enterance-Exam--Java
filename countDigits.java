public class countDigits {
    public static void main(String[] args){
        System.out.println(countDigits(32121, 1));
        System.out.println(countDigits(33331, 3));
        System.out.println(countDigits(33331, 6));
        System.out.println(countDigits(3, 3));
    }
    static int countDigits(int n, int digit){
        int count =0;
        while(n!=0){
            int reminder = n%10;
            if(reminder == digit){
                count++;
            }
            n/=10;
        }
        return count;
    }
}
