public class ValidPalindrome125 {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s1 = "race a car";
        String s2 = " ";
        String s3 = ".,";
        String s4 = "aa";
        String s5 = "\"Sue,\" Tom smiles, \"Selim smote us.\"";
        String s6 = "Go hang a salami, I'm a lasagna hog.";

        System.out.println(isPalindrome(s) == true);
        System.out.println(isPalindrome(s1) == false);
        System.out.println(isPalindrome(s2) == true);
        System.out.println(isPalindrome(s3) == true);
        System.out.println(isPalindrome(s4) == true);
        System.out.println(isPalindrome(s5) == true);
        System.out.println(isPalindrome(s6) == true);
    }

    public static boolean isPalindrome(String s) {
        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        String lowS = s.toLowerCase();
        while (leftPointer < rightPointer) {
            while ((lowS.charAt(leftPointer) < '0'
                    || (lowS.charAt(leftPointer) > '9' && lowS.charAt(leftPointer) < 'a')
                    || lowS.charAt(leftPointer) > 'z') && leftPointer < lowS.length() - 1) {
                leftPointer++;
            }
            while (rightPointer >= 0 && (lowS.charAt(rightPointer) < '0'
                    || (lowS.charAt(rightPointer) > '9' && lowS.charAt(rightPointer) < 'a')
                    || lowS.charAt(rightPointer) > 'z') ) {
                rightPointer--;
            }
            if (leftPointer >= lowS.length() - 1 && rightPointer < 0) {
                return true;
            }
            if (lowS.charAt(leftPointer) == lowS.charAt(rightPointer)) {
                if (leftPointer == rightPointer || leftPointer -1 == rightPointer) {
                    return true;
                } else if (leftPointer > rightPointer && lowS.charAt(leftPointer) == lowS.charAt(rightPointer)) {
                    return true;
                }
                leftPointer++;
                rightPointer--;
            } else {
                System.out.println("left = " + leftPointer+ " right = " + rightPointer);
                return false;
            }
        }
        System.out.println("left =" + leftPointer+ "right = " + rightPointer);
        return leftPointer == rightPointer || leftPointer - 1 == rightPointer || lowS.charAt(leftPointer) == lowS.charAt(rightPointer);
    }
}
