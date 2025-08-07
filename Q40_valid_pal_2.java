public class Q40_valid_pal_2 {

    // check valid palindrome with atmost one skip allowed

    public static boolean isValid(String s, int left, int right, boolean skipped) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (skipped) {
                    return false;
                }
                return isValid(s, left + 1, right, true) || isValid(s, left, right - 1, true);
            }
            left++;
            right--;
        }
        return true;
        
    }
    public static void main(String[] args) {
        String s = "abca";
        boolean ans = isValid(s, 0, s.length() - 1, false);
        System.out.println(ans);

    }
}
