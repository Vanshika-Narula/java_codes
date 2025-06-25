public class Q11_string_rotation {

    public static boolean check_rot(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }

        String str = s1+s1;
        return str.contains(s2);
    }
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println(check_rot(s1, s2));
    }
}
