import java.util.*;

public class Q51_3_sum {

    public static List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        Set<List<Integer>> hs = new HashSet<>();
        for (int i = 0; i < n - 2; i++) {
            int low = i + 1;
            int high = n - 1;
            int sum = 0;

            while (low < high) {
                sum = arr[i] + arr[low] + arr[high];
                if (sum == 0) {
                    hs.add(Arrays.asList(arr[i], arr[low], arr[high]));
                    low++;
                    high--;
                } else if (sum > 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return new ArrayList<>(hs);
    }
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> al = threeSum(arr);
        for (List<Integer> ar : al) {
            System.out.println(ar);
        }

    }
}
