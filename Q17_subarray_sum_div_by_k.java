import java.util.HashMap;

public class Q17_subarray_sum_div_by_k {

    public static int no_of_subarrays(int[] arr, int k){
        int n = arr.length;
        int cnt = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num : arr){
            prefixSum+=num;
            int mod = prefixSum%k;
            if(mod<0){
                mod+=k;
            }
            cnt+=map.getOrDefault(mod, 0);
            map.put(mod, map.getOrDefault(mod, 0)+1);
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,0,-2,-3,1};
        int k = 5;
        int ans = no_of_subarrays(arr, k );
        System.out.println(ans);
    }
}
