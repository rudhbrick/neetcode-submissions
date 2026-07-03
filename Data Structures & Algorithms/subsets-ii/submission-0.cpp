class Solution {
public:
    vector<vector<int>> ans;
    vector<int> nums;
    vector<int> subset;
    void backtrack(int index){
        ans.push_back(subset);
        for(int i=index;i<nums.size();i++){
            if(i>index&&nums[i]==nums[i-1]) continue;
            subset.push_back(nums[i]);
            backtrack(i+1);
            subset.pop_back();
        }
    }
    vector<vector<int>> subsetsWithDup(vector<int>& nums){
        sort(nums.begin(),nums.end());
        ans.clear();
        subset.clear();
        this->nums=nums;
        backtrack(0);
        return ans;
    }
};