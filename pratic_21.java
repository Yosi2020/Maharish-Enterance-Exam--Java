public class pratic_21 {
    public static void main(String[] args){
        System.out.println(closestFibonic(13));
        System.out.println(closestFibonic(33));
        System.out.println(closestFibonic(34));
        System.out.println(closestFibonic(0));
        System.out.println(closestFibonic(-5));

    }

    static int closestFibonic(int n){
        if(n<1){
            return 0;
        }

        int prevFib=1;
        int currentFib = 1;
        int nextFib;
        while(true){
            nextFib = prevFib+currentFib;
            if(nextFib>n){
                return currentFib;
            }
            prevFib = currentFib;
            currentFib = nextFib;
        }
    }
}
