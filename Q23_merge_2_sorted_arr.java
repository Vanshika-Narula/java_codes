public class Q23_merge_2_sorted_arr {

    public static void merge_sorted(int[] nums1, int m, int[] nums2, int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>=nums2[j]){
                nums1[k--]=nums1[i--];
            }
            else{
                nums1[k--]=nums2[j--];
            }
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[]  nums2 = {2,5,6};
        int n = 3;
        merge_sorted(nums1, m, nums2, n);
        for(int no: nums1)
            System.out.print(no+" ");

    }
}
