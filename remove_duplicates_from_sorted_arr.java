public class remove_duplicates_from_sorted_arr {
//     The goal is to remove duplicates from a sorted array in-place and return the count of unique elements.
// Note:
// This algorithm modifies the array such that the first k elements are unique.
// It returns the value k.

    public static int unique_elem(int[] arr){
        int n = arr.length;
        int i=0;
        for(int j=0; j<n; j++) {
            if(arr[i]!=arr[j]){
                i++;
            }

            arr[i]=arr[j];
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int ans = unique_elem(arr);
        System.out.println(ans);
    }
}
