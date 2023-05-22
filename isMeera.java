public class isMeera {
    public static void main(String[] args){
        System.out.println(isMeera(new int[]{3,5,-2}));
        System.out.println(isMeera(new int[]{8,3,4}));
    }
    static int isMeera(int [] a){
        for(int value : a){
            int timesTwo = value*2;
            for(int othervalue: a){
                if(timesTwo == othervalue){
                    return 0;
                }
            }
        }
        return 1;
    }
}
