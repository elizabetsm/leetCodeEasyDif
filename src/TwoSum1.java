import java.util.Arrays;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int j = 1;
        int i = 0;
        while (i < nums.length) {
            while (j < nums.length ) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
                j++;
            }
            i++;
            j = i + 1;
        }
        return null;
    }
}
