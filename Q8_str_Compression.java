public class Q8_str_Compression {

    public static String compress(String str){
        if(str.length()<=1){
            return str;
        }

        StringBuilder sb = new StringBuilder();
        int cnt=0;
        for(int i=0; i<str.length(); i++) {
            cnt++; 
            if(i+1>=str.length() || str.charAt(i)!=str.charAt(i+1)){
                sb.append(str.charAt(i));
                sb.append(cnt);
                cnt=0;
            }
            

        }
        return str.length() < sb.toString().length() ? str : sb.toString();
    }
    public static void main(String[] args) {
        String str = "aabccccaaa";
        String ans = compress(str);
        System.out.println(ans);
    }
}
