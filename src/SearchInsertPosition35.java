public class SearchInsertPosition35 {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};

        System.out.println(searchInsert(nums, 5) == 2);
        System.out.println(searchInsert(nums, 2) == 1);
        System.out.println(searchInsert(nums, 7) == 4);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = (left + right) / 2;

        while (left <= right) {
            if (nums[middle] != target) {
                if (target > nums[middle]) {
                    left = middle + 1;
                    middle = (left+right) / 2;
                } else if (target < nums[middle]) {
                    right = middle - 1;
                    middle = (left+right) / 2;
                }
            } else if (target == nums[middle]) {
                return middle;
            }
            if (left == right) {
                int a = nums[left];
                while (a < target){
                    a++;
                }
            }
        }
        System.out.println(left);
        return left;
    }
}
