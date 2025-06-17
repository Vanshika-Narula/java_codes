import java.util.LinkedHashSet;
import java.util.Set;

public class sq_of_1st_two {
    
    public static void main(String[] args) {
        String s = "5622381275";
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0; i<s.length(); i++) {
            if(i%2!=0){
                Character ch=s.charAt(i);
                if(Character.isDigit(ch))
                    set.add(Character.getNumericValue(ch));
            }
        }

        Set<Integer> lhs = new LinkedHashSet<>();
        for(int st : set){
            lhs.add(st*st);
        }
        StringBuilder otp = new StringBuilder();
        for(int e: lhs){
            otp.append(e);
        }
        System.out.println(otp.substring(0, Math.min(4, otp.length())));

    }
}
