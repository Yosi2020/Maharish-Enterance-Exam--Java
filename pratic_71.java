public class pratic_71 {
    public static void main(String[] args){
        System.out.println(arrayHasNoZeros(new int[] {1,2,3}));
        System.out.println(arrayHasNoZeros(new int[] {1,0,4,0}));
        System.out.println(arrayHasNoZeros(new int[] {1,2,3, 0}));
        System.out.println(arrayHasNoZeros(new int[] {0,0,0}));
        System.out.println(arrayHasNoZeros(new int[] {}));
    }

    static int arrayHasNoZeros(int[] a){
        if(a.length==0) return 1;
        for(int i=0; i<a.length; i++){
            if(a[i]==0) return 0;
        }
        return 1;
    }
}
