// make subarray of size 5, find the minimum difference 
//between the maximum and minimum 
// element in the array
import java.util.*;

public class Q14_choco_distribution {

    public static int find_min_diff(int[] arr, int m){
        Arrays.sort(arr);
        int n = arr.length;
        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<n-m ;i++){
            int diff = arr[i+m-1] - arr[i];
            minDiff = Math.min(diff, minDiff);
        }

        return minDiff;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;
        int diff = find_min_diff(arr, m);
        System.out.println(diff);

    }
}
