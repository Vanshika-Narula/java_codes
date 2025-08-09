public class Q43_move_zeroes {

    public static void move_zeroes(int[] arr) {
        int n = arr.length;
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[pos++] = arr[i];
            }
        }

        while (pos < n) {
            arr[pos++] = 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        move_zeroes(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
