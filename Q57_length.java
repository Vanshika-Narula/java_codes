public class Q57_length {

    public static void str_len(String s) {
        char[] arr = s.toCharArray();
        int cnt = 0;
        try {
            while (true) {
                char ch = arr[cnt];
                cnt++;
            }
        } catch (Exception e) {
            System.out.println("count: "+ cnt);
        }
    }
    public static void main(String[] args) {
        String s = "stringlength";
        str_len(s);
        // System.out.println(ans);
    }
}
