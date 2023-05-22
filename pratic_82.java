public class pratic_82 {
    public static void main(String[] args){
        System.out.println(smallest(3));
        System.out.println(smallest(4));
        System.out.println(smallest(5));
        System.out.println(smallest(6));
        System.out.println(smallest(7));
    }
    static int smallest(int n){
        int count = 0;
        int digit = 1;

        while(true){
            for(int i=1; ; i++){
                int eyu = digit * i;
                if(isContaintwo(eyu)){
                    count++;
                    if(count==n){
                        return digit;
                    }
                }
                else break;
            }
            count=0;
            digit++;
        }
    }

    static boolean isContaintwo(int digit){
        while(digit!=0){
            int reminder = digit%10;
            if(reminder==2){
                return true;
            }
            digit/=10;
        }
        return false;
    }
}
