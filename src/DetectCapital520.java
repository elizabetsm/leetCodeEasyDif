import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class DetectCapital520 {
    public static void main(String[] args) {
//        System.out.println(detectCapitalUse("USA"));
//        System.out.println(detectCapitalUse("leetcode"));
        System.out.println(detectCapitalUse("Google"));
//        System.out.println(detectCapitalUse("FlaG"));
    }

    public static boolean detectCapitalUse(String word) {
        byte[] wordBytes = word.getBytes();
        int lowerCharCount = 0;
        int upperCharCount = 0;
        for (byte bytes : wordBytes) {
            if (bytes <= 'z' && bytes >= 'a') {
                lowerCharCount++;
            } else {
                upperCharCount++;
            }
        }
        int strLength = word.length();
        if (strLength == lowerCharCount || strLength == upperCharCount) {
            return true;
        } else if (strLength == (lowerCharCount - 1) && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            return true;
        }
        return false;
    }
}
