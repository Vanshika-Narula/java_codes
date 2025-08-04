import java.util.*;

public class Q26_count_frq {

    public static void count_frequency(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> en : map.entrySet()) {
            System.out.println(en.getKey()+" "+en.getValue());
        }
        
    }
    public static void main(String[] args) {
        String str = "hello world";
        count_frequency(str);
    }
}
