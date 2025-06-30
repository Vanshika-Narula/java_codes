import java.util.HashMap;

public class Q18_longest_harmonious {

    public static int longest_subseq(int[] arr){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int cnt = 0;
        for(int num : map.keySet()){
            if(map.containsKey(num+1)){
                int currLen = map.get(num)+map.get(num+1);
                cnt = Math.max(currLen, cnt);
            }
        }

        return cnt;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,2,5,2,3,7};
        int ans = longest_subseq(arr);
        System.out.println(ans);

    }
}
