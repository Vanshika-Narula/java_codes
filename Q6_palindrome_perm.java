import java.util.HashMap;

public class Q6_palindrome_perm {

    public static boolean palindrome_permutation(String str) {
        int[] count = new int[128];
        str = str.toLowerCase();
        for(char ch : str.toCharArray()){
            if(ch!=' ')
                count[ch]++;
        }

        int oddCounts = 0;
        for(int i : count){
            if(i%2!=0)
                oddCounts++;
        }
        return oddCounts<=1;
    }
    public static void main(String[] args) {
        String str = "Taco coa";
        boolean isValid = palindrome_permutation(str);
        System.out.println(isValid);
    }
}
