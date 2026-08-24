class Solution{
    public int maxSubArray(int[] nums){
        int curr=0,best=nums[0];
        for(int i=0;i<nums.length;i++){
            curr+=nums[i];
            best=Math.max(best,curr);
            if(curr<0) curr=0;
        }
        return best;
    }
}