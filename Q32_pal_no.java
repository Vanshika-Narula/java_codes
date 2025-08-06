public class Q32_pal_no {

    public static boolean palindrome(int n) {
        if(n<0)
            return false;
        int x = n;
        int rev = 0;
        while (n != 0) {
            int dig = n % 10;
            rev = rev * 10 + dig;
            n = n / 10;
        }
        return rev == x;
    }

    public static void main(String[] args) {
        // int n = 121;
        int n = -121;
        boolean ans = palindrome(n);
        System.out.println(ans);
    }
}
