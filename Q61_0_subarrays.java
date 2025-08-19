public class Q61_0_subarrays {

    public static int zero_filled_subarrays(int[] arr) {
        int cnt = 0;
        int cont = 0;
        for (int num : arr) {
            cont = (num == 0) ? cont + 1 : 0;
            cnt += cont;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 3, 0, 0, 2, 0, 0, 4 };
        int ans = zero_filled_subarrays(arr);
        System.out.println(ans);
    }
}
