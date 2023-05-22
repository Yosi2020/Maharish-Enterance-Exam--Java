public class pratic_25 {
    public static void main(String[] args){
        System.out.println(isTriangular(1));  // Output: 1
        System.out.println(isTriangular(3));  // Output: 1
        System.out.println(isTriangular(6));  // Output: 1
        System.out.println(isTriangular(10)); // Output: 1
        System.out.println(isTriangular(4));  // Output: 0
    }

    static int isTriangular(int n){
        if(n<=0) return 0;

        int sum = 0, j=1;
        while(sum<n){
            sum += j;
            j++;
        }
        return (sum == n)?1:0;
    }
}
