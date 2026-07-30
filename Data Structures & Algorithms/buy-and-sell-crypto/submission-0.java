class Solution {
    public int maxProfit(int[] prices) {
        int maxprices=0;
        int minprices=101;
        for(int i =0;i<prices.length;i++){
            if(prices[i]<minprices){
                minprices=prices[i];
            }
            int sum=prices[i]-minprices;
            maxprices=Math.max(maxprices,sum);
        }
        if(maxprices>0){
            return maxprices;
        }
        else{
            return 0;
        }
    }
}
