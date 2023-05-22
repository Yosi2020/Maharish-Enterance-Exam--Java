public class pratic_84 {
    public static void main(String[] args){
        int[][] testArrays = {
                {1,2,3,0,2,2},
                {1,2},
                {1,2,0,1,2,0,1,2},
                {3,3,0,3,3,0,3,3,0,3,3},
                {0,0,0,0},
                {1,2,3,4,5,6,7,8,9,10},
                {1,3,0,3,5,0}
        };

        for (int[] testArray : testArrays) {
            System.out.println(isRailroadTie(testArray));
        }
    }

    static int isRailroadTie(int [] a){
        if(a.length == 0  || a.length==1&& (a[0]==0  || a[a.length-1] ==0)){
            return -1; // incomplete array
        }
        if(a.length<2 && a[0]==0 || a[1]==0){
            return 0;  // when index of array is < 2 and its boarder is zero
        }
        for(int i=1; i<a.length-1; i++){
            if(a[i-1]==0 && a[i+1]==0 || a[a.length-1]==0 || a[i]!=0 && a[i-1]!=0 && a[i+1]!=0){
                return 0;
            }
        }
        return 1;
    }
}
