public class pratic_52 {
    public static void main(String[] args){
        System.out.println(nextPerfectSquare(6));
        System.out.println(nextPerfectSquare(36));
        System.out.println(nextPerfectSquare(0));
        System.out.println(nextPerfectSquare(-5));
    }
    static int nextPerfectSquare(int n){
        for(int i=0; i<=n; i++){
            if((i*i) == n){
                return (i+1)*(i+1);
            }
            else if(i*i > n){
                return i*i;
            }
        }
        return 0;
    }
}
