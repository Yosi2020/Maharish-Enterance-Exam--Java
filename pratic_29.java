public class pratic_29 {
    public static void main(String[] args){
        System.out.println(isMartian(new int[]{1, 3})); // Output: 1
        System.out.println(isMartian(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1})); // Output: 1
        System.out.println(isMartian(new int[]{1, 3, 2})); // Output: 0
        System.out.println(isMartian(new int[]{1, 3, 2, 2, 1, 5, 1, 5})); // Output: 0
        System.out.println(isMartian(new int[]{1, 2, -18, -18, 1, 2})); // Output: 0
        System.out.println(isMartian(new int[]{})); // Output: 0
        System.out.println(isMartian(new int[]{1})); // Output: 1
        System.out.println(isMartian(new int[]{2})); // Output: 0
    }
   static int isMartian(int[] a){
        int count2=0, count1=0;
        for(int i=0; i<a.length; i++){
            if(a[i] == 1){
                count1++;
            } else if (a[i]==2) {
                count2++;
            }

            if(i>0 && a[i] == a[i-1]) return 0;
        }
        return (count1>count2)?1:0;
   }
}
