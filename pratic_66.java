public class pratic_66 {
    public static void main(String[] args) {
        System.out.println(henry(1, 3)); // Output: 502
    }

    static int henry(int i, int j) {
        return findNthPerfectNum(i) + findNthPerfectNum(j);
    }

    static int findNthPerfectNum(int n) {
        int count = 0;
        for (int num = 1; ; num++) {
            if (isPerfect(num)) {
                count++;
                if (count == n) {
                    return num;
                }
            }
        }
    }

    static boolean isPerfect(int num) {
        int sum = 1; // Start with 1 since all numbers are divisible by 1
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return sum == num && num != 1; // Exclude 1 as it's not a perfect number
    }
}
