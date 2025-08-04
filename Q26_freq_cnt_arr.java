import java.util.*;


public class Q26_freq_cnt_arr {
    public static void main(String[] args) {
        String s = "hello world";
        int[] arr = new int[26];
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                arr[ch - 'a']++;
            }
        }
        
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                System.out.println((char) (i+'a')+" "+arr[i]);
            }
        }
    }
}
