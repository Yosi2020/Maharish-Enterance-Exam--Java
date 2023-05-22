public class pratic_75 {
    public static void main(String[] args){
        System.out.println(isSumSafe(new int[] {5,-5,0}));
        System.out.println(isSumSafe(new int[] {5,-2,1}));
    }

    static int isSumSafe(int [] a){
        if(a.length==0) return 0;

        int sum = 0;
        for(int value:a){
            sum+= value;
        }
        for(int value: a){
            if(sum== value){
                return 0;
            }
        }
        return 1;
    }
}
