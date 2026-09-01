class Solution{
    public int[] decompressRLElist(int[] nums){
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2) for(int j=0;j<nums[i];j++) result.add(nums[i+1]);
        int[] ans=new int[result.size()];
        for(int i=0;i<result.size();i++) ans[i]=result.get(i);
        return ans;
    }
}