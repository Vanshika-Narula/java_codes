public class Q47_fibbonacci_no {

    public static int fibonacci_no(int n) {
        if(n<2)
            return n;
        return fibonacci_no(n - 1) + fibonacci_no(n - 2);
    }
    public static void main(String[] args) {
        int n = 4;
        int ans = fibonacci_no(n);
        System.out.println(ans);
    }
}
