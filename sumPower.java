public class sumPower {
    public static void main(String[] args){
        System.out.println(sumIsPower(new int[] {8,8,8,8}));
        System.out.println(sumIsPower(new int[] {8,8,8}));
    }
    public static boolean sumIsPower(int[] arr) {
        if (arr == null) {
            return false;
        }

        int sum = 0;
        for (int value : arr) {
            sum += value;
        }

        return (sum != 0) && ((sum & (sum - 1)) == 0);
    }

}
