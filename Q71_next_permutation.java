public class Q71_next_permutation {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int[] arr, int st) {
        int i = st;
        int j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void next_perm(int[] arr) {
        int n = arr.length;
        int idx1 = -1;
        int idx2 = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                idx1 = i;
                break;
            }
        }

        if (idx1 == -1) {
            reverse(arr, 0);
        }

        else {
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] > arr[idx1]) {
                    idx2 = i;
                }
            }
            swap(arr, idx1, idx2);
            reverse(arr, idx1 + 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 1,5 };
        next_perm(arr);
        for(int i: arr)
            System.out.print(i+" ");
    }
}
