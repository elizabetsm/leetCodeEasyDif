public class BinarySearch704 {

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int[] nums1 = {5};
        int[] nums2 = {2,5};
        int[] nums3 = {5};
        int[] nums4 = {-1,0,5};

        System.out.println(search(nums, 9) == 4);
        System.out.println(search(nums, 2) == -1);
        System.out.println(search(nums1, -5) == -1);
        System.out.println(search(nums2, 5) == 1);
        System.out.println(search(nums3, 5) == 0);
        System.out.println(search(nums4, -1) == 0);

    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        int mid ;

        int res = -1;
        while (left <= right ) {
            mid = ( (left+right) / 2);
            if (left == right) {
                return nums[mid] == target? mid : res;
            }
            if (nums[mid+1]== target) {
                return mid+1;
            }
            if (target < nums[mid]) {
                right = mid ;
                continue;
            } else if (target > nums[mid]) {
                left = mid ;
            } else {
                return mid;
            }
            if (left == right - 1) {
                return res;
            }
        }
        return res;
    }
}
