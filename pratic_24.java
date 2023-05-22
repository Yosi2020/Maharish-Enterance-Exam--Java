public class pratic_24 {
    public static void main(String[] args){
        System.out.println(isFibonacci(13)); // Output: 1
        System.out.println(isFibonacci(27)); // Output: 0
        System.out.println(isFibonacci(34)); // Output: 1
        System.out.println(isFibonacci(5));  // Output: 1
        System.out.println(isFibonacci(12)); // Output: 0
    }

    static int isFibonacci(int n){
        if(n<=0) return 0;
        int a = 1;
        int b = 1;

        while(a<n){
            int temp = a;
            a = b;
            b = temp+b;
        }
        return (a==n)?1:0;
    }
}
