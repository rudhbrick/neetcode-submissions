class Solution{
public:
    int robLinear(vector<int>& nums){
        int n=nums.size();
        if(n==1) return nums[0];
        vector<int> dp(n);
        dp[0]=nums[0];
        dp[1]=max(nums[0],nums[1]);
        for (int i=2;i<n;i++) {
            dp[i]=max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[n-1];
    }
    int rob(vector<int>& nums){
        int n=nums.size();
        if(n==1) return nums[0];
        vector<int> first(nums.begin(),nums.end()-1);
        vector<int> second(nums.begin()+1,nums.end());
        int value1=robLinear(first);
        int value2=robLinear(second);
        return max(value1,value2);
    }
};