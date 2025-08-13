import java.util.Stack;

public class Q56_val_paranthesis {

    public static boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (st.peek() == '(' && !st.isEmpty() && ch == ')') {
                st.pop();
            } else if (!st.isEmpty() && ch == '}' && st.peek() == '{') {
                st.pop();
            } else if (!st.isEmpty() && ch == ']' && st.peek() == '[') {
                st.pop();
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s = "()[]{}";
        boolean ans = isValid(s);
        System.out.println(ans);
    }
}
