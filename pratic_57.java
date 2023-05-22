public class pratic_57 {
    public static void main(String[] args){
        int[][] testArrays = {
                {9, 0, 2, -5, 7},
                {9}
        };

        for (int[] testArray : testArrays) {
            System.out.println(countSquarePairs(testArray));
        }
    }

    static int countSquarePairs(int[] a){
        if(a.length < 2) return 0;
        int count=0;

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(a[i]>0 && a[j] >0 && a[i]<a[j]){
                    System.out.println(a[i] + " --" + a[j]);
                    for(int c=0; c<=(a[i]+a[j])/2; c++){
                        if(c*c == (a[i]+a[j]))
                            count++;
                    }
                }
            }
        }
        return count;
    }
}
