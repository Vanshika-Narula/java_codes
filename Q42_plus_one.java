public class Q42_plus_one {

    // arr=[1,2,3] o/p:[1,2,4]
    // arr=[1,3,9] o/p:[1,4,0]
    // arr=[9,9,9] o/p:[1,0,0,0]

    public static int[] plusOne(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
        
    }
    public static void main(String[] args) {
        int[] arr = { 9,9,9 };
        int[] ans = plusOne(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
