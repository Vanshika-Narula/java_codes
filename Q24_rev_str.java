public class Q24_rev_str {
    public static void main(String[] args) {
        String s = "Hello world";
        int i = 0;
        int j = s.length() - 1;
        char[] arr = s.toCharArray();
        
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println(new String(arr));


    }
}
