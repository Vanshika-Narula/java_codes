public class Q44_running_sum {
    public static int[] running_sum(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] ans = running_sum(arr);
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}