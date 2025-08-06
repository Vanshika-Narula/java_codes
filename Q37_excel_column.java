public class Q37_excel_column {

    public static String corrCol(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            sb.insert(0, (char) ((n % 26) + 'A'));
            n /= 26;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int colNo = 701;
        String ans = corrCol(colNo);
        System.out.println(ans);

    }
}
