import java.util.*;

public class Q59_nge1 {

    public static int[] next_greater(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] res = new int[n1];
        Map<Integer, Integer> map = new HashMap();
        Stack<Integer> st = new Stack<>();
        for (int i : arr2) {
            if (!st.isEmpty() && st.peek() < i) {
                map.put(st.pop(), i);
            }
            st.push(i);
        }

        for (int i = 0; i < n1; i++) {
            res[i] = map.getOrDefault(arr1[i], -1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = { 4, 1, 2 };
        int[] arr2 = { 1,3, 4, 2 };
        int[] ans = next_greater(arr1, arr2);
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}
