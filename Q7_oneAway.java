public class Q7_oneAway {

    public static boolean check(String a, String b) {
        if((Math.abs(a.length()-b.length())>1))
            return false;

        String s1 = a.length()<b.length()?a:b; // shorter string
        String s2 = a.length()<b.length()?b:a; // longer string

        int idx1=0;
        int idx2=0;
        boolean found=false;
        while(idx1<s1.length() && idx2<s2.length()){
            if(s1.charAt(idx1)!=s2.charAt(idx2)){
                if(found) return false;
                found=true;

            if(s1.length()==s2.length()){
                idx1++;
            }
            }
            else{
                idx1++;
            }
            idx2++;
            
        }
        return true;


    }
    public static void main(String[] args) {
        String a = "pales";
        String b = "pale";
        System.out.println(a+" "+b+" "+ check(a,b));
    }
}
