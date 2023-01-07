public class RemoveElement27 {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int[] nums2 = {0,1,2,2,3,0,4,2};

        System.out.println(removeElement(nums, 3));
        System.out.println(removeElement(nums2, 2));
    }

    public static int removeElement(int[] nums, int val) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                 continue;
            }
            nums[count] = nums[i];
            count++;
        }
        return count;
    }
}
