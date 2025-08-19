public class Q60_hills_valleys {

    public static int countHV(int[] arr) {
        int n = arr.length;
        int cnt = 0;
        int left = 0;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                if ((arr[i] > arr[left] && arr[i] > arr[i + 1]) || (arr[i] < arr[left] && arr[i] < arr[i + 1]))
                    cnt++;
                left = i;
            }
        }
        return cnt;
    }
    
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 1, 6, 5 };
        int ans = countHV(arr);
        System.out.println(ans);

    }
}
