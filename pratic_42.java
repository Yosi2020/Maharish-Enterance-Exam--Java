public class pratic_42 {
    public static void main(String[] args){
        int[] a1 = {1,2,0,3};
        System.out.println(isAllPossibilities(a1));
        int[] a2 = {3,2,1,0};
        System.out.println(isAllPossibilities(a2));
        int[] a3 = {1,2,4,3};
        System.out.println(isAllPossibilities(a3));
        int[] a4 = {0,2,3};
        System.out.println(isAllPossibilities(a4));
        int[] a5 = {0};
        System.out.println(isAllPossibilities(a5));
        int[] a6 = {};
        System.out.println(isAllPossibilities(a6));
    }
    static int isAllPossibilities(int [] a){
        if(a.length == 0) return 0;

//        a = sort(a);

        for(int i=0; i< a.length-1; i++){
            boolean isSequence = false;
            for(int value: a){
                if(value == i) {
                    isSequence = true;
                    break;
                }
            }
            if(!isSequence){
                return 0;
            }
        }
        return 1;
    }
//    static int[] sort(int[] a){
//        for(int i=0; i<a.length; i++){
//            for(int j=i+1; j<a.length; j++){
//                if(a[i]>a[j]){
//                    int temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        return a;
//    }
}
