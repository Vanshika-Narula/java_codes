public class Q70_idx_of1st_occ {

    public static int idxOf1stOcc(String h, String n) {
        if(h==null || n==null || n.length()>h.length())
            return -1;
        if(n.isEmpty())
            return 0;
        for (int i = 0; i <= h.length() - n.length(); i++) {
            if (h.substring(i, i + n.length()).equals(n))
                return i;
        }
        return -1;

    }
    public static void main(String[] args) {
        String haystack = "eeleetcode";
        String needle = "leet";
        int idx = idxOf1stOcc(haystack, needle);
        System.out.println(idx);
    }
}
