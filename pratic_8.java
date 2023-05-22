public class pratic_8 {
    public static void main(String [] args){
        System.out.println(isCubePowerful(153));
        System.out.println(isCubePowerful(370));
        System.out.println(isCubePowerful(371));
        System.out.println(isCubePowerful(407));
        System.out.println(isCubePowerful(87));
        System.out.println(isCubePowerful(0));
        System.out.println(isCubePowerful(-81));
    }

    static int isCubePowerful(int n){
        if(n <= 0) return 0;
        int digit = n;
        int eyu = 0;
        while(n!=0){
            int reminder = n % 10;
            int contact_val = 1;
            for(int i=0; i < 3; i++){
                contact_val *= reminder;
            }
            eyu += contact_val;
            n /= 10;
        }
        System.out.println(eyu);
        return (digit == eyu) ? 1: 0;
    }
}
