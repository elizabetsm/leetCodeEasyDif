public class PalindromeNumber9 {
    public static void main(String[] args) {
        int pal = 121;
        int pal1 = -121;
        int pal2 = 10;

//        System.out.println(isPalindrome(pal));
//        System.out.println(isPalindrome(pal1));
        System.out.println(isPalindrome(pal2));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String val = String.valueOf(x);
        int len = val.length();
        for (int i = 0; i < len / 2; i++) {
            if (val.charAt(i) != val.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
