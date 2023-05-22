public class pratic_50 {
    public static void main(String[] args){
        System.out.println(percentDivisibleByThree(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}));
        System.out.println(percentDivisibleByThree(new int[]{3, 6, 9}));
        System.out.println(percentDivisibleByThree(new int[]{1, 2, 4, 5}));
        System.out.println(percentDivisibleByThree(new int[]{0, 3, 6, -3, -6}));
        System.out.println(percentDivisibleByThree(new int[]{}));
    }

    static double percentDivisibleByThree(int[] a){
        int count =0;
        for(int i : a){
            if(i%3==0) count++;
        }
        if(a.length ==0) return 0.0;
        return (double) count/a.length * 100;
    }
}
