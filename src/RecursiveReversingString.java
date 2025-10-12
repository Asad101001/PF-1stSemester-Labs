public class RecursiveReversingString {

    public static int reverse(int n) {
        int digits = (int)Math.log10(n);
        return reverseRecursive(n, digits);
    }

    private static int reverseRecursive(int n, int digits) {
        if (n < 10) return n;
        return (n % 10) * (int)Math.pow(10, digits) + reverseRecursive(n / 10, digits - 1);
    }

    public static void main(String[] args) {
        int number = 6942069;
        int reversed = reverse(number);
        System.out.println("Reversed: " + reversed);
    }
}
