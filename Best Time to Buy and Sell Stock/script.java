class Solution {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4,5,12};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {

       int maxProfito = 0; int minPrice = Integer.MAX_VALUE;
       for(int i=0; i<prices.length; i++){
            if(prices[i]<minPrice) minPrice = prices[i];
            else{
                int profit = prices[i] - minPrice;
                if(profit > maxProfito) maxProfito = profit; 
            }
       }
       return maxProfito;
    }
}