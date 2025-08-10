public class Q48_squares_of_sorted_arr {

    public static int[] squaresOfArr(int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        int[] nums = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(arr[l]) >= Math.abs(arr[r])) {
                nums[i] = arr[l] * arr[l];
                l++;
            } else {
                nums[i] = arr[r] * arr[r];
                r--;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = { -4, -1, 0, 3, 10 };
        int[] ans = squaresOfArr(arr);
        for (int i : ans) {
            System.out.print(i+" ");
        }
        
    }
}
