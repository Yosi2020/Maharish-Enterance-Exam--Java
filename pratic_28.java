public class pratic_28 {
    public static void main(String[] args){
        System.out.println(computeHMS(3735));
        System.out.println(computeHMS(380));
        System.out.println(computeHMS(3650));
        System.out.println(computeHMS(55));
        System.out.println(computeHMS(0));
    }
    static int[] computeHMS(int seconds){
        int[] arr = new int[3];
        int[] data = {3600, 60, 1};
        for(int i = 0; i<data.length; i++){
            int eyu = seconds/data[i];
            arr[i] = eyu;
            seconds = seconds%data[i];
        }
        System.out.println("Example");
        for(int j : arr){
            System.out.println(j);
        }

        return arr;
    }
}
