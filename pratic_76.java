public class pratic_76 {
    public static void main(String[] args){
        System.out.println(isIsolated(162)); // 0
        System.out.println(isIsolated(2)); // 1
        System.out.println(isIsolated(400)); //0
        System.out.println(isIsolated(63)); // 1
    }

    static int isIsolated(long n){
        // return -1 if n is not in the valid range
        if (n < 1 || n > 2097151) {
            return -1;
        }

        long square = n * n;
        long cubic = n * n * n;
        int countSquare = count(square);
        int countCubic = count(cubic);

        int [] squareArray = new int[countSquare];
        int [] cubicArray = new int[countCubic];
        int l =0, k=0;

        while(square>0){
            int reminder = (int) (square % 10);
            squareArray[l] = reminder;
            square/=10;
            l++;
        }
        while(cubic>0){
            int reminderCube = (int) (cubic % 10);
            cubicArray[k] = reminderCube;
            cubic/=10;
            k++;
        }
        // compare the digit frequencies
        for (int i = 0; i < countSquare; i++) {
            for(int j=0; j< countCubic; j++){
                if(squareArray[i] == cubicArray[j]){
                    return 0;
                }
            }
        }
        return 1;
    }

    static int count(long n){
        int count =0;
        while(n!=0){
            long reminder = n % 10;
            count++;
            n/=10;
        }
        return count;
    }
}
