public class pratic_77 {
    public static void main(String[] args){
        System.out.println(isVanilla(new int[] {1}));
        System.out.println(isVanilla(new int[] {1, 1, 11, 1111, 1111111}));
        System.out.println(isVanilla(new int[] {11, 101, 1111, 11111}));
        System.out.println(isVanilla(new int[] {11, 22, 13, 34, 125}));
        System.out.println(isVanilla(new int[] {9, 999, 99999, -9999}));
        System.out.println(isVanilla(new int[] {}));
    }

    static int isVanilla(int[] a){
        if(a.length==0) return 1;

        for(int i = 0; i<a.length; i++){
            int count=0;
            int n = a[i]<0? -a[i]:a[i];
            while(n!=0){
                int reminder = n%10;
                count++;
                n/=10;
            }
            int [] eyu = new int[count];
            int abebe = a[i];
            int j=0;
            while(abebe!=0){
                int reminder = abebe%10;
                eyu[j] = reminder;
                abebe/=10;
                j++;
            }
            for(int l=0; l<eyu.length; l++){
                for(int m=0; m<eyu.length; m++){
                    if(eyu[l]!=eyu[m]) return 0;
                }
            }
        }
        return 1;
    }
}
