public class Q55_isPowOf3 {

    public static boolean isPowerOf3(int n) {
        if(n<=0)
            return false;
        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        int n = 27;
        boolean ans = isPowerOf3(n);
        System.out.println(ans);
    }
}
