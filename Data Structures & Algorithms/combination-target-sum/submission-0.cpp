class Solution {
public:
    vector<vector<int>> ans;
    vector<int> nums;
    vector<int> combination;
    void backtrack(int index,int remainingTarget){
        if(remainingTarget==0){
            ans.push_back(combination);
            return;
        }
        if(remainingTarget<0||index==nums.size()) return;
        combination.push_back(nums[index]);
        backtrack(index,remainingTarget-nums[index]);
        combination.pop_back();
        backtrack(index+1,remainingTarget);
    }
    vector<vector<int>> combinationSum(vector<int>& nums, int target){
        ans.clear();
        combination.clear();
        this->nums=nums;
        backtrack(0,target);
        return ans;
    }
};