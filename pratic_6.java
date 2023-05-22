public class pratic_6 {
    public static void main(String[] args) {
        int[] a1 = {1, 1, 1, 1, 1};
        int[] p1 = {1};
        System.out.println(isMatchingPattern(a1,a1.length, p1, p1.length)); // output: 1

        int[] a2 = {1};
        int[] p2 = {1};
        System.out.println(isMatchingPattern(a2, a2.length, p2, p2.length)); // output: 1

        int[] a3 = {1, 1, 2, 2, 2, 2};
        int[] p3 = {1, 2};
        System.out.println(isMatchingPattern(a3, a3.length, p3, p3.length)); // output: 1

        int[] a4 = {1, 2, 3};
        int[] p4 = {1, 2};
        System.out.println(isMatchingPattern(a4, a4.length, p4, p4.length)); // output: 0

        int[] a5 = {1, 2};
        int[] p5 = {1, 2, 3};
        System.out.println(isMatchingPattern(a5, a5.length, p5, p5.length)); // output: 0

        int[] a6 = {1, 1, 2, 2, 2, 2, 3};
        int[] p6 = {1, 3};
        System.out.println(isMatchingPattern(a6, a6.length, p6, p6.length)); // output: 0

        int[] a7 = {1, 1, 1, 1};
        int[] p7 = {1, 2};
        System.out.println(isMatchingPattern(a7, a7.length, p7, p7.length)); // output: 0

        int[] a8 = {1, 1, 1, 1, 2, 2, 3, 3};
        int[] p8 = {1, 2};
        System.out.println(isMatchingPattern(a8, a8.length, p8, p8.length)); // output: 0

        int[] a9 = {1, 1, 10, 4, 4, 3};
        int[] p9 = {1, 4, 3};
        System.out.println(isMatchingPattern(a9, a9.length, p9, p9.length)); // output: 0

    }

    static int isMatchingPattern(int[] a, int len, int[] pattern, int patternLen) {
        int i=0; // index into a
        int k=0; // index into pattern
        int matches = 0; // how many times current pattern character has been matched so far
        for (i=0; i<len; i++) {
            if (a[i] == pattern[k])
                matches++; // current pattern character was matched
            else if (matches == 0 || k == patternLen-1)
                return 0; // if pattern[k] was never matched (matches==0) or at end of pattern (k==patternLen-1)
            else // advance to next pattern character
            {
                i--;
                if(a[i]-a[i+1]!=0){
                    k++;
                }
            }
            // If the current pattern character has been matched enough times, move on to the next character in the pattern
//            if (matches == k+1 && k+1 < patternLen)
//                k++;
        }
        // return 1 if at end of array a (i==len) and also at end of pattern (k==patternLen-1)
        if (i==len && k==patternLen-1) return 1; else return  0;
    }


}

