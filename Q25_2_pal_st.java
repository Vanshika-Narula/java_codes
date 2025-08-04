import java.util.Stack;

public class Q25_2_pal_st {

    public static boolean palindrome_stack(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                char s = Character.toLowerCase(ch);
                st.push(s);
                sb.append(s);
            }
        }

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != st.pop())
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean ans = palindrome_stack(str);
        System.out.println(ans);

    }
}
