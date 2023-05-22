public class pratic_22 {
    public static void main(String[] args){
        System.out.println(isVesuvian(50));
        System.out.println(isVesuvian(65));
        System.out.println(isVesuvian(85));
        System.out.println(isVesuvian(0));
        System.out.println(isVesuvian(10));
    }

    static int isVesuvian(int n){
        int pairCount = 0;
        for(int i=1; i<n; i++){
            for(int j=1; j<n; j++){
                if(n == ((i*i) + (j*j))){
                    pairCount++;
                    System.out.println(i + " "+ j);
                    if (pairCount==2){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
