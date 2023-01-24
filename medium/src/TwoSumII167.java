import java.util.Arrays;

public class TwoSumII167 {
    public static void main(String[] args) {
        int [] numbers = {2,7,11,15};
        int [] numbers1 = {2,3,4};
        int [] numbers2 = {-1,0};

        System.out.println(Arrays.toString(twoSum(numbers, 9)));
        System.out.println(Arrays.toString(twoSum(numbers1, 6)));
        System.out.println(Arrays.toString(twoSum(numbers2, -1)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int sum ;

        while (left < right) {
            sum = numbers[left] + numbers[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else if (sum == target) {
                return new int[]{left+1, right+1};
            }
        }
        return null;
    }
}
