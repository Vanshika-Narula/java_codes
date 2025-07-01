import java.util.*;

public class Q21_three_sum {

    public static List<List<Integer>> three_sum(int[]arr){
        Arrays.sort(arr);
        int n = arr.length;
        Set<List<Integer>> hs = new HashSet<>();
        for(int i=0; i<n-2; i++){
            int low = i+1;
            int high = n-1;
            while(low<high){
                int sum = arr[i]+arr[low]+arr[high];
                if(sum==0){
                    hs.add(Arrays.asList(arr[i], arr[low], arr[high]));
                    low++;
                    high--;
                }
                else if(sum<0){
                    low++;
                }
                else{
                    high--;
                }

            }
        }

        return new ArrayList<>(hs);
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> ls = three_sum(arr);
        System.out.println(ls);
    }
}
