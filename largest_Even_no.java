import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class largest_Even_no {

    public static void print(List<Character> list){
        for(char ch: list){
            System.out.print(ch);
        }
    }

    public static void main(String[] args) {
        String s="asdf@784583";
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()) {
            if(Character.isDigit(ch)) {
                set.add(ch);
            }
        }

        List<Character> list = new ArrayList<>(set);
        list.sort(Collections.reverseOrder());

        int evenIdx=-1;
        for(int i=list.size()-1; i>=0; i--) {
            char ch = list.get(i);
            if((ch-'0')%2==0) {
                evenIdx=i;
                break;
            }
        }

        if(evenIdx==-1){
            System.out.println("-1");
            return;
        }

        if((list.get(list.size() - 1) - '0') % 2 == 0) {
            print(list);
        }

        else{
            Collections.swap(list, evenIdx, list.size()-1);
            print(list);
        }
    }
}