public class pratic_62 {
    public static void main(String[] args){
        System.out.println(guthrieIndex(1));
        System.out.println(guthrieIndex(2));
        System.out.println(guthrieIndex(3));
        System.out.println(guthrieIndex(4));
        System.out.println(guthrieIndex(42));
    }
    static int guthrieIndex(int n){
        if(n<=1) return 0;

        int count=0;
        while(n!=1){
            if(n%2 ==0){
                n/=2;
                count++;
            }
            else {
                n= (n*3)+1;
                count++;
            }
        }
        return count;
    }
}
