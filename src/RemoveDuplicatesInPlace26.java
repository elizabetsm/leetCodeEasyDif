import java.util.Arrays;

public class RemoveDuplicatesInPlace26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4,4};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[count] = nums[i];
            count++;
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
