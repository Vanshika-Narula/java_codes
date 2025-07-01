public class Q20_container_most_water {

    public static int calculate_most_water(int[] arr){
        int n = arr.length;
        int maxWater = 0;
        int i=0;
        int j=n-1;
        while(i<j){
            int area = Math.min(arr[i], arr[j]) * (j-i);
            maxWater = Math.max(area, maxWater);

            if(arr[i]<arr[j]){
                i++;
            }
            else    
                j--;
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int maxWater = calculate_most_water(arr);
        System.out.println(maxWater);
    }
}
