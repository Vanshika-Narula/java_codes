public class isUniChars {

    public static boolean isUnique(String s){

        if(s.length()>128)
            return false;
        
        boolean[] arr = new boolean[128];
        for(int i=0; i<s.length(); i++){
            int val = s.charAt(i);
            if(arr[val]==true)
                return false;
            arr[val]=true;
        }
        return true;
    }
    public static void main(String[] args) {
        String[] words = {"apple", "hello", "love", "rest", "book"};
        for(String w: words) {
            System.out.println(w+" "+ isUnique(w));
        }
    }
}
