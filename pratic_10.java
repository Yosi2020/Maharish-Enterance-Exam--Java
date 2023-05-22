public class pratic_10 {
    public static void main(String[] args){
        int [] a1 = {0, 0, 0, 0, 0};
        System.out.println(isZeroPlentiful(a1));
        int [] a2 = {1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12};
        System.out.println(isZeroPlentiful(a2));
        int [] a3 = {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0};
        System.out.println(isZeroPlentiful(a3));
        int [] a4 = {1, 2, 3, 4};
        System.out.println(isZeroPlentiful(a4));
        int [] a5 = {1, 2, 3, 4};
        System.out.println(isZeroPlentiful(a5));
        int [] a6 = {0};
        System.out.println(isZeroPlentiful(a6));
        int [] a7 = {};
        System.out.println(isZeroPlentiful(a7));
    }

    static int isZeroPlentiful(int a[]){
        int sequenceCount = 0;
        boolean sequenceStarted = false;
        int sequenceLength = 0;

        for(int i=0; i<a.length; i++){
            if(a[i] == 0){
                if(!sequenceStarted){
                    sequenceStarted=true;
                }
                sequenceLength++;
            }
            else if (sequenceStarted){
                if(sequenceLength >= 4){
                    sequenceCount++;
                }
                else return 0;

                sequenceLength = 0;
                sequenceStarted=false;
            }
        }
        if(sequenceStarted && sequenceLength>=4){
            sequenceCount++;
        }
        return sequenceCount;
    }
}
