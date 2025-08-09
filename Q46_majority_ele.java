import java.util.HashMap;
import java.util.Map;

public class Q46_majority_ele {

    public static int majority_ele(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int ans = -1;
        for (Map.Entry<Integer, Integer> en : map.entrySet()) {
            if (en.getValue() > n / 2) {
                ans = en.getKey();
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        int ans = majority_ele(arr);
        System.out.println(ans);
    }
}
