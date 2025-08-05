import java.util.HashMap;

public class Q29_two_sum {

    public static int[] two_summ(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int com = k - arr[i];
            if (map.containsKey(com)) {
                return new int[] { map.get(com), i };
            }

            map.put(arr[i], i);
        }

        return new int[] {};
    }

    
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int tar = 9;
        int[] ans = two_summ(arr, tar);
        for (int i : ans) {
            System.out.println(i+" ");
        }

    }
}
