public class Q63_divide_ints {

    public static int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor==-1)
            return Integer.MAX_VALUE;
        if(divisor==1)
            return dividend;
        return dividend / divisor;
    }
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        int ans = divide(dividend, divisor);
        System.out.println(ans);
    }
}
