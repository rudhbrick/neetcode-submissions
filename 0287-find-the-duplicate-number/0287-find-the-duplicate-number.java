class Solution{
    public int findDuplicate(int[] nums){
        int left=0,right=1,ans=0;;
        Arrays.sort(nums);
        while(right<nums.length){
            if(nums[left]==nums[right]) ans=nums[left];
            left++;
            right++;
        }
        return ans;
    }
}