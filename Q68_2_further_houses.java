public class Q68_2_further_houses {

    public static int houses_diff_clrs(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[0]) {
                ans = Math.max(ans, i);
            }
            if (arr[i] != arr[n - 1]) {
                ans = Math.max(ans, (n - 1 - i));
            }
        }
        return ans;

    }
    // leetcode 2078
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 6, 1, 1, 1 };
        int ans = houses_diff_clrs(arr);
        System.out.println(ans);

    }
}
