class Solution {
public:
    vector<vector<int>> ans;
    vector<int> nums;
    vector<int> subset;
    void backtrack(int index){
        if(index==nums.size()){
            ans.push_back(subset);
            return;
        }
        subset.push_back(nums[index]);
        backtrack(index+1);
        subset.pop_back();
        backtrack(index+1);
    }
    vector<vector<int>> subsets(vector<int>& nums){
        ans.clear();
        subset.clear();
        this->nums=nums;
        backtrack(0);
        return ans;
    }
};