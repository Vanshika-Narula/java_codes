public class Q33_happy_no {

    public static boolean isHappy(int n) {
        if(n==1 || n==7)
            return true;
        else if(n<10)
            return false;
        else {
            int sum = 0;
            while (n > 0) {
                int dig = n % 10;
                sum += dig * dig;
                n = n / 10;
            }
            return isHappy(sum);
        }
    }
    public static void main(String[] args) {
        int n = 25;
        boolean ans = isHappy(n);
        System.out.println(ans);
    }
}
