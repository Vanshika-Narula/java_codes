package Sliding_window;

public class f_max_sub_sum_of_size_k {

    public static int max_subarray_sum(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        while (j < n) {
            sum += arr[j];
            if ((j - i + 1) < k) {
                j++;
            } else if ((j - i + 1) == k) {
                max = Math.max(sum, max);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] arr = { 100, 200, 300, 400 };
        int k = 2;
        int ans = max_subarray_sum(arr, k);
        System.out.println(ans);
    }
}
