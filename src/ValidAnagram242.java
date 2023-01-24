import java.util.HashMap;
import java.util.Map;

public class ValidAnagram242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram") == true);
        System.out.println(isAnagram("rat", "car") == false);
    }

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i< s.length(); i++) {
            char a=s.charAt(i);
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }

        for (int i = 0; i < t.length();i++) {
            char a=t.charAt(i);
            if (map.containsKey(a)) {
                if (map.get(a) == 1) {
                    map.remove(a);
                } else {
                    map.put(a, map.get(a) -1);
                }
            }
        }
        return map.isEmpty();
    }
}
