public class pratic_91 {
    public static void main(String[] args){
        System.out.println(findSmallestBEQnumber());
    }
    static int findSmallestBEQnumber(){
        for(int i=0; ; i++){
            if(isBEQ(i)){
                return i;
            }
        }
    }
    static boolean isBEQ(int num){
        long cube = (long) num*num*num;
        int countsix=0;
        while(cube>0){
            if(cube%10==6){
                countsix++;
            }
            cube/=10;
        }
        return (countsix>=4)?true:false;
    }
}
