public class pratic_15 {
    public static void main(String[] args) {
        int[] encodedArray = encodeArray(999);
        for (int i : encodedArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] encodeArray(int n) {
        int numDigits = 0;
        int temp = n < 0 ? -n : n;

        if(n == 0) return new int[]{1};

        while (temp > 0) {
            numDigits += temp % 10 + 1;
            temp /= 10;
        }
        System.out.println("numDigits value"+numDigits);

        int[] encodedArray = new int[n < 0 ? numDigits + 1 : numDigits];
        int index = encodedArray.length - 1;

        if (n < 0) {
            encodedArray[0] = -1;
            n = -n;
        }
        if (n == 0) {
            n = 1;
        }

        while (n > 0) {
            int digit = n % 10;
            encodedArray[index--] = 1;
            for (int i = 0; i < digit; i++) {
                encodedArray[index--] = 0;
            }
            n /= 10;
        }

        return encodedArray;
    }
}
