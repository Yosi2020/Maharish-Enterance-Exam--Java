public class pratic_9 {
    public static void main(String[] args){
        int [] a1 = {0,-3,0,-4,0};
        System.out.println(decodeArray(a1, a1.length));
        int [] a2 = {-1, 5, 8, 17, 15};
        System.out.println(decodeArray(a2, a2.length));
        int [] a3 = {1, 5, 8, 17, 15};
        System.out.println(decodeArray(a3, a3.length));
        int [] a4 = {1, 5, 8, 17, 15};
        System.out.println(decodeArray(a4, a4.length));
        int [] a5 = {1,1};
        System.out.println(decodeArray(a5, a5.length));
    }

    static int decodeArray(int a[], int len){
        int contact_number = 0;
        for(int i=0; i<a.length-1; i++){
            int eyu = a[i] - a[i+1];
            int abs = eyu<0 ? -eyu:eyu;
            contact_number = (contact_number*10)+abs;
        }
        return (a[0]<0)?-contact_number:contact_number;
    }
}
