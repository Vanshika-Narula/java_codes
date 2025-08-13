public class Q54_pal_no {

    public static boolean isPal(int n) {
        int x = n;
        int rev = 0;
        while (n > 0) {
            int dig = n % 10;
            rev = rev * 10 + dig;
            n = n / 10;
        }
        return x == rev;
    }
    public static void main(String[] args) {
        int n = 121;
        boolean ans = isPal(n);
        System.out.println(ans);

    }
}
