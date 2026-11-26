class Solution{
    public int maxProfit(int[] prices){
        int profit=Integer.MAX_VALUE,best=0;
        for(int p:prices){
            profit=Math.min(profit,p);
            best=Math.max(best,p-profit);
        }
        return best;
    }
}