import java.util.*;

public class Q22_major_el {

    public static int majority_el(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n/2];

    }

    public static int majority_ele(int[] arr){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int ans = 0;
        for(Map.Entry<Integer, Integer> en : map.entrySet()){
            int val = en.getValue();
            ans = en.getKey();
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int majorEl = majority_el(arr);
        System.out.println(majorEl);
        System.out.println(majority_ele(arr));
    }
}
