class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> ans;
        sort(nums.begin(),nums.end());
        int len=nums.size();
        int left;
        int right;
        int fixed;
        for(int i=0;i<len-2;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            fixed=nums[i];
            left=i+1;
            right=len-1;
            while(left < right){
                if(fixed+nums[left]+nums[right]>0){
                    right--;
                }else if(fixed+nums[left]+nums[right]<0){
                    left++;
                }else if(fixed+nums[left]+nums[right]==0){
                    ans.push_back({fixed,nums[left],nums[right]});
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right] == nums[right+1]){
                        right--;
                    }
                }
            }
        }
        return ans;
    }
};