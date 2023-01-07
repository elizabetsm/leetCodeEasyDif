public class LengthOfLastWord58 {

    public static void main(String[] args) {
        String s = "Hello World";
        String s1 = "   fly me   to   the moon  ";
        String s2 = "luffy is still joyboy";

        System.out.println(lengthOfLastWord(s) == 5);
        System.out.println(lengthOfLastWord(s1) == 4);
        System.out.println(lengthOfLastWord(s2) == 6);
    }

    public static int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        return strs[strs.length-1].length();
    }
}
