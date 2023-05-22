public class hasKSmallFactors {
    public static void main(String[] args){
        System.out.println(hasKSmallFactors(7,30));
        System.out.println(hasKSmallFactors(6,14));
        System.out.println(hasKSmallFactors(6,30));
        System.out.println(hasKSmallFactors(10,20));
        System.out.println(hasKSmallFactors(7,22));
    }

    static boolean hasKSmallFactors(int k, int n){
        for(int i=0; i<k; i++){
            for(int j=0; j<k; j++){
                if(i*j == n){
                    System.out.println("I- "+i+ " J:- "+ j);
                    return true;
                }
            }
        }
        return false;
    }
}
