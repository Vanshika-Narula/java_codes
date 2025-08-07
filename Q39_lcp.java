public class Q39_lcp {

    public static String longestCommPrefix(String[] strs) {
        if(strs==null || strs.length==0)
            return "";
        String pre = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
                if (pre.isEmpty())
                    return "";
            }
        }
        return pre;
    }
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        String ans = longestCommPrefix(strs);
        System.out.println(ans);
    }
}
