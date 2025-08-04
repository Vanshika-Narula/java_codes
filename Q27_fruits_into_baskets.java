import java.util.HashMap;

public class Q27_fruits_into_baskets {

    public static int totalFruits(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int cnt = 0;
        while (j < n) {
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);

            if (map.size() > 2) {
                map.put(arr[i], map.get(arr[i]) - 1);
                if (map.get(arr[i]) == 0) {
                    map.remove(arr[i]);
                }
                i++;
            }
            cnt = Math.max(cnt, j - i + 1);
            j++;
        }

        return cnt;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 2, 4, 4, 4 };
        int ans = totalFruits(arr);
        System.out.println(ans);
    }
}
