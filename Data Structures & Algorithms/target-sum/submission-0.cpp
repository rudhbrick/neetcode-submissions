class Solution{
public:
    vector<int> nums;
    unordered_map<string,int> memo;
    int dfs(int i,int remaining){
        if(i==nums.size()){
            if(remaining==0) return 1;
            return 0;
        }
        string key=to_string(i)+","+to_string(remaining);
        if(memo.count(key)) return memo[key];
        int ans=dfs(i+1,remaining-nums[i])+dfs(i+1,remaining+nums[i]);
        memo[key]=ans;
        return memo[key];
    }
    int findTargetSumWays(vector<int>& nums,int target){
        this->nums=nums;
        return dfs(0,target);
    }
};