import java.util.PriorityQueue;

public class Q64_insert_pos {

    public static int insert_position(int[] arr, int tar) {
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : arr) {
            pq.add(i);
        }

        pq.add(tar);
        int cnt = 0;
        while (pq.peek() != tar) {
            pq.poll();
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        int tar = 5;
        int ans = insert_position(arr, tar);
        System.out.println(ans);
    }
}
