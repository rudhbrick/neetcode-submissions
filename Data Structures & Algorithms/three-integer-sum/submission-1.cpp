class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> ans;
        sort(nums.begin(),nums.end());
        int len=nums.size();
        int left;
        int right;
        int third;
        for(int i=0;i<len-2;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            third=nums[i];
            left=i+1;
            right=len-1;
            while(left < right){
                if(third+nums[left]+nums[right]>0){
                    right--;
                }else if(third+nums[left]+nums[right]<0){
                    left++;
                }else if(third+nums[left]+nums[right]==0){
                    ans.push_back({third,nums[left],nums[right]});
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }
            }
        }
        return ans;
    }
};