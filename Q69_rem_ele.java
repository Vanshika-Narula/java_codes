public class Q69_rem_ele {

    public static int removeEle(int[] arr, int val) {
        int n = arr.length;
        int cnt = 0;
        for (int i : arr) {
            if (i != val) {
                arr[cnt++] = i;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 3, 3, 2, 2, 2, 3 };
        int val = 3;
        int ans = removeEle(arr, val);
        System.out.println(ans);
        
    }
}
