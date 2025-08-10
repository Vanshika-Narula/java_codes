public class Q50_rem_dup {

    public static int remove_duplicates(int[] arr) {
        int n = arr.length;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (arr[i] != arr[j])
                i++;
            arr[i] = arr[j];
        }
        return i + 1;
    }
    public static void main(String[] args) {
        int[] arr = { 0,0,1,1,1,2,2,3,3,4};
        int ans = remove_duplicates(arr);
        System.out.println(ans);

    }
}
