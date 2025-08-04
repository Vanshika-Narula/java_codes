public class Q25_pal_check {

    public static boolean isPal(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            char l = str.charAt(i);
            char r = str.charAt(j);
            if (!Character.isLetterOrDigit(l)) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(r)) {
                j--;
                continue;
            }

            if (Character.isLowerCase(i) != Character.isLowerCase(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        // String str = "A man, a plan, a canal: Panama";
        // String st = str.toLowerCase().trim();
        // char[] arr = st.toCharArray();
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < arr.length; i++) {
        //     if (Character.isLetterOrDigit(arr[i])) {
        //         sb.append(arr[i]);
        //     }
        // }
        // String s = sb.toString();
        
        
        // int i = 0;
        // int j=s.length()-1;
        // while (i < j) {
        //     if (s.charAt(i) != s.charAt(j)) {
        //         System.out.println("false");
        //         return;
        //     }
        //     i++;
        //     j--;
        // }
        
        // System.out.println("true");

        String str = "A man, a plan, a canal: Panama";
        boolean ans = isPal(str);
        System.out.println(ans);
        
    }
}
