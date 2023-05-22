public class pratic_96 {
    public static void main(String[] args){
        System.out.println(isFilter(new int[]{1,2,3,9,6,11}));
        System.out.println(isFilter(new int[]{4,4,6,7,14,16}));
        System.out.println(isFilter(new int[]{1,2,3,4,10,11,13}));
        System.out.println(isFilter(new int[]{3,6,5,5,13,16,13}));
        System.out.println(isFilter(new int[]{9,6,18}));
        System.out.println(isFilter(new int[]{4,7,13}));

    }
    static int isFilter(int[] a){
        boolean isSeven = false;
        boolean isNine = false;
        boolean found11 = false, found13=false;
        for(int value : a){
            if(value==7){
                isSeven =true;
            }
            else if(value==9){
                isNine=true;
            }
            else if(value == 13){
                found13= true;
            }
            else if(value==11){
                found11 = true;
            }
        }

        if (isNine && !found11) {
            return 0;
        }
        if (isSeven && found13) {
            return 0;
        }
        return 1;
    }
}
