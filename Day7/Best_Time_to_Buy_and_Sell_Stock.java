/**
 * Best_Time_to_Buy_and_Sell_Stock
 */
public class Best_Time_to_Buy_and_Sell_Stock {

    public static int maxProfit(int[] prices) {
        int min=prices[0];
        int diff=0;
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(min>prices[i]) min=prices[i];
            diff=prices[i]-min;
            max=Math.max(max,diff);
        }
        System.gc();
        return max;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}