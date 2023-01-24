import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,1};
        int [] nums2 = {1,2,3,4};
        int [] nums3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums1) == true);
        System.out.println(containsDuplicate(nums2) == false);
        System.out.println(containsDuplicate(nums3) == true);
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> temp = new HashSet<>();

        for (int num : nums) {
            if (temp.contains(num)) {
                return true;
            } else {
                temp.add(num);
            }
        }
        return false;
    }
}
