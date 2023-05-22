public class pratic_23 {
    public static void main(String[] args){
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1})); // Output: 1
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1, 0})); // Output: 0
        System.out.println(isOneBalanced(new int[]{1, 1, 2, 3, 1, -18, 26, 1})); // Output: 0
        System.out.println(isOneBalanced(new int[]{})); // Output: 1
        System.out.println(isOneBalanced(new int[]{3, 4, 1, 1})); // Output: 1
        System.out.println(isOneBalanced(new int[]{1, 1, 3, 4})); // Output: 1
        System.out.println(isOneBalanced(new int[]{3, 3, 3, 3, 3, 3})); // Output: 0
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 1, 1, 1})); // Output: 0
    }

    static int isOneBalanced(int[] a) {
        int beginningOnes = 0;
        int endingOnes = 0;
        int nonOnes = 0;

        int i = 0;
        while(i<a.length && a[i]==1){
            beginningOnes++;
            i++;
        }


        int j=a.length-1;
        while(j>=0 && a[j]==1){
            endingOnes++;
            j--;
        }

        for(int k=i; k<=j;k++){
            if(a[k]!=1){
                nonOnes++;
            }
            else return 0;
        }
        return (beginningOnes+endingOnes==nonOnes)?1:0;
    }
}

