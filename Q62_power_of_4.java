public class Q62_power_of_4 {

    public static boolean isPowOf4(int n) {
        if(n<=0)
            return false;
        while (n % 4 == 0) {
            n = n / 4;
        }
        return n == 1;
        
    }
    public static void main(String[] args) {
        int n = 16;
        boolean ans = isPowOf4(n);
        System.out.println(ans);
    }
}
