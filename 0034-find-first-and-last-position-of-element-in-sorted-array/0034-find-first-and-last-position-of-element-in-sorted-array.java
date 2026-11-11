class Solution{
    int find(int[] nums,int target,boolean isFirst){
        int left=0,right=nums.length-1,ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                if(isFirst) right=mid-1;
                else left=mid+1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums,int target){
        int first=find(nums,target,true),last=find(nums,target,false);
        return new int[]{first,last};
    }
}