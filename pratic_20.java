public class pratic_20 {
    public static void main(String[] args){
        char[] a1 = {'s', 'i', 't'};
        char[] a2 = {'i', 't', 's'};
        System.out.println(areAnagrams(a1,a2));
        char[] a3 = {'s', 'i', 't'};
        char[] a4 = {'i', 'd', 's'};
        System.out.println(areAnagrams(a3,a4));
        char[] a5 = {'b', 'i', 'g'};
        char[] a6 =  {'b', 'i', 't'};
        System.out.println(areAnagrams(a5,a6));
        char[] a7 = {'b', 'o', 'g'};
        char[] a8 = {'b', 'o', 'o'};
        System.out.println(areAnagrams(a7,a8));
        char[] a9 = {};
        char[] a10 = {};
        System.out.println(areAnagrams(a9,a10));
        char[] a11 = {'b', 'i', 'g'};
        char[] a12 = {'b', 'i', 'g'};
        System.out.println(areAnagrams(a11,a12));
        char[] a13 = {'b', 'b', 'g'};
        char[] a14 = {'b', 'i', 'g'};
        System.out.println(areAnagrams(a13,a14));
    }
    static int areAnagrams(char [] a1, char [] a2){
        if (a1.length != a2.length) return 0;

        for (int i = 0; i < a1.length; i++) {
            boolean found = false;
            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]) {
                    found = true;
                    a2[j] = '\0'; // mark as visited
                    break;
                }
            }
            if (!found) return 0; // if a character in a1 is not found in a2, return false
        }
        return 1;
    }

}
