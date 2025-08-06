import java.util.Arrays;

public class Q35_max_3_prod {

    public static int max_Product(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int prod1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int prod2 = nums[0] * nums[1] * nums[n - 1];
        return Math.max(prod1, prod2);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(max_Product(nums));
    }
}
