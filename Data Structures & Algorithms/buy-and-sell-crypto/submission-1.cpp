class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int mini=prices[0];
        int best=0;
        for(int i=0;i<prices.size();i++){
            mini=min(mini,prices[i]);
            int profit=prices[i]-mini;
            best=max(best,profit);
        }
        return best;
    }
};