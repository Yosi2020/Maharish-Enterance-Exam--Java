public class pratic_64 {
    public static void main(String[] args){
        int [] a1 = {3,2,0,5,3};
        int n1 = 32053;
        System.out.println(repsEqual(a1, n1));
        int [] a2 = {3,2,0,5};
        int n2 = 32053;
        System.out.println(repsEqual(a2, n2));
        int [] a3 = {3,2,0,5,3,4};
        int n3 = 32053;
        System.out.println(repsEqual(a3, n3));
        int [] a4 = {2,3,0,5,3};
        int n4 = 32053;
        System.out.println(repsEqual(a4, n4));
        int [] a5 = {9,3,1,1,2};
        int n5 = 32053;
        System.out.println(repsEqual(a5, n5));
        int [] a6 = {3,2,0,5,3};
        int n6 = 32053;
        System.out.println(repsEqual(a6, n6));
    }

    static int repsEqual(int[] a, int n){
        int contact=0;

        for(int i=0; i<a.length; i++){
            contact= (contact*10)+a[i];
        }
        System.out.println(contact);
        if(contact == n) return 1;
        return 0;
    }
}
