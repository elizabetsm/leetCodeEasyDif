import java.util.Arrays;

public class MergeSortedArray88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        int[] nums3 = {1};
        int m1 = 1;
        int[] nums4 = {};
        int n1 = 0;

        int[] nums5 = {0};
        int m2 = 0;
        int[] nums6 = {1};
        int n2 = 1;

        merge(nums1, m, nums2, n);
        merge(nums3, m1, nums4, n1);
        merge(nums5, m2, nums6, n2);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int numsTwoPointer = n - 1;
        int numsOnePointer = m - 1;
        int lastValPointer = m + n - 1;

        while (numsOnePointer >= 0 && numsTwoPointer >= 0) {
            if (nums1[numsOnePointer] > nums2[numsTwoPointer]) {
                nums1[lastValPointer] = nums1[numsOnePointer];
                numsOnePointer--;
            } else {
                nums1[lastValPointer] = nums2[numsTwoPointer];
                numsTwoPointer--;
            }
            lastValPointer--;
        }
        while (numsTwoPointer >= 0) {
            nums1[lastValPointer] = nums2[numsTwoPointer];
            lastValPointer--;
            numsTwoPointer--;
        }
        Arrays.stream(nums1).forEach(System.out::println);
        System.out.println("--------------");
    }
}
