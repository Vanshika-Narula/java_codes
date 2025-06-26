import java.util.HashMap;

public class Q13_two_sum {

    public static int[] find_target(int[] arr, int target){
        int n = arr.length;
        HashMap<Integer, Integer> map =new HashMap<>();
        for(int i=0; i<n; i++){
            int comm = target-arr[i];
            if(map.containsKey(comm)){
                return new int[]{map.get(comm), i };
            }

            
            map.put(arr[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        int[] ans = find_target(arr, target);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
