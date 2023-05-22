public class isBunker {
    public static void main(String[] args){
        System.out.println(isBunker(new int[]{7,6,10,1}));
        System.out.println(isBunker(new int[]{7,6,10}));
        System.out.println(isBunker(new int[]{6,10,1}));
        System.out.println(isBunker(new int[]{3,7,1,8,1}));
    }
    static int isBunker(int[] a){
        boolean isOdd = false;
        boolean isContain1 = false;

        for(int i =0; i<a.length; i++){
            if(a[i]%2!=0 && a[i]!=1){
                isOdd = true;
            }
            if(a[i]==1){
                isContain1=true;
            }
        }
        return (isOdd && isContain1)? 1:0;
    }
}
