public class Q45_pivot_index {

    public static int pivot_idx(int[] arr) {
        int n = arr.length;
        int tSum = 0;
        for (int i : arr) {
            tSum += i;
        }

        int lSum = 0;
        for (int i = 0; i < n; i++) {
            int rSum = tSum - lSum - arr[i];
            if (lSum == rSum) {
                return i;
            }
            lSum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 7, 3, 6, 5, 6 };
        int ans = pivot_idx(arr);
        System.out.println(ans);

    }
}
