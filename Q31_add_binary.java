public class Q31_add_binary {

    public static String add_binary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carr = 0;
        while(i>=0 || j>=0){
            int sum = carr;
            if(i>=0) sum += a.charAt(i--)-'0';
            if(j>=0) sum+=b.charAt(j--)-'0';
            carr=sum>1?1:0;
            sb.append(sum%2);
        }
        if(carr!=0) sb.append(carr);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String a = "11";
        String b = "1";

        String ans = add_binary(a, b);
        System.out.println(ans);


    }
}
