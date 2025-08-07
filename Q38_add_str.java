public class Q38_add_str {

    public static String AddString(String num1, String num2) {
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int n1 = i >= 0 ? arr1[i] - '0' : 0;
            int n2 = j >= 0 ? arr2[j] - '0' : 0;
            int sum = n1 + n2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String num1 = "456";
        String num2 = "77";
        String ans = AddString(num1, num2);
        System.out.println(ans);
    }
}
