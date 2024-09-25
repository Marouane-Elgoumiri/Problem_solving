m = [2,5,4,4,8];
n = [1,2,3,4,5];

var getMaxProfit = function(prices, profits){
    const n = prices.length;
    let sum=0; let maxProfit=-Infinity;
    if(n<3) return -1
    
    for(let i=0; i<n-2; i++){
        if(prices[i] < prices[i+1] && prices[i+1] < prices[i+2]){
            sum = profits[i] + profits[i+1] + profits[i+2];
            maxProfit = Math.max(maxProfit, sum);
        }
    }
    return maxProfit === -Infinity ? -1 : maxProfit;
}

console.log(getMaxProfit(m,n))