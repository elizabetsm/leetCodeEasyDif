public class MajorityElement169 {

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int[] nums1 = {2,2,1,1,1,2,2};
        int[] nums3 = {10,9,9,9,10};

        System.out.println(majorityElement(nums) == 3);
        System.out.println(majorityElement(nums1) == 2);
        System.out.println(majorityElement(nums3) == 9);
    }

    public static int majorityElement(int[] nums) {
        int res = nums[0];
        int count = 0;

        for (int num : nums) {
            if (num == res) {
                count++;
            } else {
                count--;
            }

            if (count < 0) {
                res = num;
                count = 0;
            }
        }
        return res;
    }
}
