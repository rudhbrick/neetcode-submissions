class Solution{
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int l;
        int r;
        int t;
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            t=nums[i];
            l=i+1;
            r=nums.length-1;
            while(l<r){
                if(t+nums[l]+nums[r]>0){
                    r--;
                }else if(t+nums[l]+nums[r]<0){
                    l++;
                }else if(t+nums[l]+nums[r]==0){
                    ans.add(Arrays.asList(t,nums[l],nums[r]));
                    l++;
                    r--;
                    while(l<r&&nums[l]==nums[l-1]) l++;
                    while(l<r&&nums[r]==nums[r+1]) r--;
                }
            }
        }
        return ans;
    }
}