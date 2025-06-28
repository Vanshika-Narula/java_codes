public class Q15_best_time_to_buy_sell_Stocks {

    public static int max_profit(int[] arr){
        int n = arr.length;
        int mini = arr[0];
        int profit = Integer.MIN_VALUE;

        for(int i=1; i<n; i++){
            int diff = arr[i]-mini;
            profit = (profit > diff) ? profit : diff;
            mini = Math.min(mini, arr[i]);
        }

        return profit;
    }
    public static void main(String[] args) {
    int[] arr = {7,1,5,3,6,4};
    int ans = max_profit(arr);
    System.out.println(ans); 
    }
}
