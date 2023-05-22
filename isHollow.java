public class isHollow {
    public static void main(String[] args){
        System.out.println(isHollow(new int []{1,2,4,0,0,0,3,4,5}));
        System.out.println(isHollow(new int []{1,2,0,0,0,3,4,5}));
        System.out.println(isHollow(new int []{1,2,4,9,0,0,0,3,4,5}));
        System.out.println(isHollow(new int []{1,2,0,0,3,4}));
    }
    static int isHollow(int [] a){
        int countzeros = 0;
        int countAfter = 0;
        int countBefore = 0;
        int i=0;

        while(i<a.length && a[i]!=0){
            countBefore++;
            i++;
        }
        while(i<a.length && a[i]==0){
            countzeros++;
            i++;
        }
        while(i<a.length && a[i]!=0){
            countAfter++;
            i++;
        }

        return (countAfter==countBefore
                && countzeros>=3)?1:0;
    }
}
