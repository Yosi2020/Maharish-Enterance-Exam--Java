public class isMeeraa {
    public static void main(String[] agrs){
        System.out.println(isMeera(6));
        System.out.println(isMeera(30));
        System.out.println(isMeera(21));
    }
    static int isMeera(int n){
        int count =0;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                count++;
            }
        }
        if(n%count==0) return 1;
        return 0;
    }
}
