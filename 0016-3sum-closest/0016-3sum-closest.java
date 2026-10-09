class Solution{
    public int threeSumClosest(int[] nums,int target){
        int n=nums.length;
        int left,right,third,sum=0;;
        Arrays.sort(nums);
        int closest=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            third=nums[i];
            left=i+1;
            right=n-1;
            while(left<right){
                sum=nums[left]+nums[right]+third;
                if(Math.abs(sum-target)<Math.abs(closest-target)) closest=sum;
                if(sum<target){
                    left++;
                }else if(sum>target){
                    right--;
                }else{
                    return target;
                }
            }
        }
        return closest;
    }
}