public class Q30_rev_int {
    public static void main(String[] args) {
        int no = -76543;
        
        int rev = 0;
        while (no != 0) {
            int dig = no % 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE && dig > 7)) {
                System.out.println("0");
                return;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE && dig < -8)) {
                System.out.println("0");
                return;
            }
            rev = rev * 10 + dig;
            no = no / 10;
        }

        System.out.println(rev);
        
        
    }
}
