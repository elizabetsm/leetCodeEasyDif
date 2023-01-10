public class PowerOfTwo231 {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(2));

    }
    public static boolean isPowerOfTwo(int n) {

        if (n <= 0) {
            return false;
        }
        while (n > 0) {
            if (n == 1) {
                return true;
            }
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }
        return true;
    }
}
