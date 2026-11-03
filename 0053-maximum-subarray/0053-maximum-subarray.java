class Solution{
    public int maxSubArray(int[] nums){
        int curr=0,best=nums[0];
        for(int num:nums){
            curr+=num;
            best=Math.max(best,curr);
            if(curr<0) curr=0;
        }
        return best;
    }
}