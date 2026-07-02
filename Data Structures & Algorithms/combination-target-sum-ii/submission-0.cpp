class Solution {
public:
    vector<vector<int>> ans;
    vector<int> candidates;
    vector<int> combination;
    void backtrack(int index,int remainingTarget){
        if(remainingTarget==0){
            ans.push_back(combination);
            return;
        }
        if(remainingTarget<0||index==candidates.size()) return;
        for(int i = index; i < candidates.size(); i++){
            if(i>index&&candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>remainingTarget) break;
            combination.push_back(candidates[i]);
            backtrack(i+1,remainingTarget-candidates[i]);
            combination.pop_back();
        }
    }
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target){
        sort(candidates.begin(),candidates.end());
        ans.clear();
        combination.clear();
        this->candidates=candidates;
        backtrack(0,target);
        return ans;
    }
};