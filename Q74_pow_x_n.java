public class Q74_pow_x_n {

    // leetcode 50
    public static double power(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x, N);
    }

    public static double fastPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        }
        else {
            return half * half * x;
        }
    }
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        double ans = power(x, n);
        System.out.println(ans);
    }
}
