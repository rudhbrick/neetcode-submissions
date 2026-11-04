class Solution{
    public int[] smallerNumbersThanCurrent(int[] nums){
        HashMap<Integer,Integer> mp=new HashMap<>();
        int[] sorted=nums.clone();
        int[] ans=new int[nums.length];
        Arrays.sort(sorted);
        for(int i=0;i<nums.length;i++) mp.putIfAbsent(sorted[i],i);
        for(int i=0;i<nums.length;i++) ans[i]=mp.get(nums[i]);
        return ans;
    }
}