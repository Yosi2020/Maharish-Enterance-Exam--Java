public class isEvenSubset {
    public static void main(String[] args){
        System.out.println(isEvenSubset(18,12));
    }
    public static int isEvenSubset(int m, int n) {
        for (int i = 2; i <= m; i += 2) {
            // check if i is a factor of m and if i is not a factor of n
            if (m % i == 0 && n % i != 0) {
                return 0; // i is an even factor of m but not a factor of n, so return 0
            }
        }
        return 1; // all even factors of m are also factors of n
    }

}
