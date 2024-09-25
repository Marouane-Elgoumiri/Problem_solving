package Maximum_Profit;

public class script {
    public static void main(String[] args) {
        int[] m = {1,5,3,4,6};
        int[] n = {2,3,4,5,6};
        System.out.println(getMaxProfit(m,n));
    }
    public static int getMaxProfit(int[] Prices, int[] Profits){
        int sum=0; int MaxProfit = Integer.MIN_VALUE;

        for (int i = 0; i < Prices.length-2; i++) {
            if(Prices[i] < Prices[i+1] && Prices[i+1] < Prices[i+2]){
                sum = Profits[i] + Profits[i+1] + Profits[i+2];
                MaxProfit = Math.max(MaxProfit, sum);
            }
        }
        return MaxProfit == Integer.MIN_VALUE ? -1 : MaxProfit;
    }
}
