public class Q34_missing_no {

    public static int missing_no(int[] arr) {
        int n = arr.length;
        int sum = n * (n + 1) / 2;
        int asum = 0;
        for (int i : arr) {
            asum += i;
        }
        return sum - asum;
    }
    public static void main(String[] args) {
        int[] nums = { 3, 0, 1 };
        int ans = missing_no(nums);
        System.out.println(ans);


    }
}
