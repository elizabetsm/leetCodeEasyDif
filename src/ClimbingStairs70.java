public class ClimbingStairs70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(2) == 2);
        System.out.println(climbStairs(3) == 3);
        System.out.println(climbStairs(5) == 8);
    }

    public static int climbStairs(int n) {
        int one = 1;
        int two = 1;
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            temp = one;
            one += two;
            two = temp;
        }
        return  one;
    }
}
