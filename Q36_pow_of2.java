public class Q36_pow_of2 {

    public static boolean isPowOf2(int n){
        if (n == 0)
            return false;
        if(n==1)
            return true;
        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        int n = 18;
        boolean ans = isPowOf2(n);
        System.out.println(ans);
    }
}
