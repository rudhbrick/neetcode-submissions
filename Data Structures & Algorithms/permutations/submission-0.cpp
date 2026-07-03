class Solution {
public:
    vector<int> permutation;
    vector<vector<int>> ans;
    vector<int> nums;
    vector<bool> visited;
    void backtrack(){
        if(permutation.size()==nums.size()){
            ans.push_back(permutation);
            return;
        }
        for(int i=0;i<nums.size();i++){
            if(visited[i]) continue;
            visited[i]=true;
            permutation.push_back(nums[i]);
            backtrack();
            permutation.pop_back();
            visited[i]=false;
        }
    }
    vector<vector<int>> permute(vector<int>& nums) {
        ans.clear();
        permutation.clear();
        this->nums=nums;
        visited.assign(nums.size(),false);
        backtrack();
        return ans;
    }
};