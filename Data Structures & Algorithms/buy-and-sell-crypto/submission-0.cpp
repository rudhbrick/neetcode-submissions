class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int min_so_far=prices[0];
        int best_so_far=0;
        for(int i=0;i<prices.size();i++){
            min_so_far=min(min_so_far,prices[i]);
            int profit=prices[i]-min_so_far;
            best_so_far=max(best_so_far,profit);
        }
        return best_so_far;
    }
};
