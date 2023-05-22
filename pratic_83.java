public class pratic_83 {
    public static void main(String[] args){
        int[][] testArrays = {
                {3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4},
                {0, 0, 0, 2, 0, 2, 0, 2, 0, 0},
                {18},
                {},
                {-5, -5, -5, -5, -5},
                {1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1},
                {8, 8, 6, 6, -2, -2, -2}
        };

        for (int[] testArray : testArrays) {
            System.out.println(clusterCompression(testArray));
        }
    }

    static int[] clusterCompression(int[] a){
        int numCluster = 1;
        if(a.length==0) return new int [] {};

        for(int i = 0; i<a.length-1; i++){
            if(a[i]!=a[i+1])
                numCluster++;
        }
        int j=1;
        int [] result =  new int [numCluster];
        result[0] = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i-1] != a[i]){
                result[j] = a[i];
                j++;
            }
        }

        System.out.println("Example");
        for(int value:result){
            System.out.println(value);
        }
        return result;
    }
}
