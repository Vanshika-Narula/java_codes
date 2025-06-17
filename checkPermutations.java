import java.util.*;
public class checkPermutations {

    // public static String sort(String s) {
    //     char[] arr = s.toCharArray();
    //     Arrays.sort(arr);
    //     return new String(arr);
    // }

    public static boolean permuations(String w1, String w2) {
        // return sort(w1).equals(sort(w2));
        if(w1.length() != w2.length())
            return false;
        int[] arr = new int[256];
        for(int i=0; i<w1.length(); i++){
            arr[w1.charAt(i)]++;
            arr[w2.charAt(i)]--;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0)
                return false;
        }
        return true;

    }
    public static void main(String[] args) {
        String[][] strings = {{"carrot", "tarroc"}, {"hello","lloeh"}, {"treasure", "treesure"}, {"ra", "tree"}};
        for(String[] pair : strings){
            String w1 = pair[0];
            String w2 = pair[1];
            boolean anagram = permuations(w1, w2);
            System.out.println(w1+" "+ w2+ " "+ anagram);
        }
    }
}
