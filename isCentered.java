public class isCentered {
    public static void main(String[] args){
        System.out.println(isCentered(new int []{5,3,3,4,5}));
        System.out.println(isCentered(new int []{3,2,1,4,5}));
        System.out.println(isCentered(new int []{3,2,1,4,1}));
        System.out.println(isCentered(new int []{3,2,1,1,4,6}));
        System.out.println(isCentered(new int []{}));
        System.out.println(isCentered(new int []{1}));
    }
    static int isCentered(int[]a){
        if(a.length%2==0 || a.length==0) return -1;

        if(a.length==1) return 1;

        for(int i = 0; i<a.length; i++){
            if(i<(a.length-1)/2 && a[(a.length-1)/2]>=a[i]){
                return 0;
            }
            else if(i>(a.length-1)/2 && a[(a.length-1)/2]>=a[i]){
                return 0;
            }
        }
        return 1;
    }
}
