public class Q67_max_increasing_diff {
    // leetcode - 2016

    public static int maxDiff(int[] arr) {
        int n = arr.length;
        int minVal = arr[0];
        int ans = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > minVal) {
                ans = Math.max(ans, (arr[i] - minVal));
            } else {
                minVal = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,4};
        int ans = maxDiff(arr);
        System.out.println(ans);
    }
}
