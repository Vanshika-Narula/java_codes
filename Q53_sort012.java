public class Q53_sort012 {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort012(int[] arr) {
        int n = arr.length;
        int i = 0, j = 0, k = n - 1;
        while (i <= k) {
            if (arr[i] == 2) {
                swap(arr, i, k);
                k--;
            } else if (arr[i] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        sort012(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    
    }
}
