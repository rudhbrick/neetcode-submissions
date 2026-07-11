class Solution{
public:
    int maxSubArray(vector<int>& nums){
        int currentSum=nums[0];
        int best=nums[0];
        for(int i=1;i<nums.size();i++){
            currentSum=max(nums[i],currentSum+nums[i]);
            best=max(best,currentSum);
        }
        return best;
    }
};