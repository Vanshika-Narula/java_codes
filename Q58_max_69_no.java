public class Q58_max_69_no {

    public static int max_69(int n) {
        String s = String.valueOf(n);
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '6') {
                arr[i] = '9';
                break;
            }
        }

        String an = new String(arr);
        int ans = Integer.parseInt(an);
        return ans; 
    }
    public static void main(String[] args) {
        int n = 9669;
        int ans = max_69(n);
        System.out.println(ans);
    }
}
