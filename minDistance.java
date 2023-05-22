public class minDistance {
    public static void main(String[] args){
        System.out.println(minDistance(13013));
        System.out.println(minDistance(8));
    }
    public static int minDistance(int n) {
        int minDistance = n;
        int prevFactor = -1;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // i is a factor of n
                if (prevFactor != -1) {
                    int distance = i - prevFactor;
                    if (distance < minDistance) {
                             minDistance = distance;
                    }
                }
                prevFactor = i;
            }
        }
        return minDistance;
    }

}
