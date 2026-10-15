class Solution{
    public int maxProfit(int[] prices){
        int min=Integer.MAX_VALUE,best=0;
        for(int p:prices){
            min=Math.min(min,p);
            best=Math.max(best,p-min);
        }
        return best;
    }
}