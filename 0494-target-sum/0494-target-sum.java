class Solution{
    int[] nums;
    HashMap<String,Integer> mp;
    int dfs(int i,int remaining){
        if(i==nums.length){
            return remaining==0?1:0;
        }
        String key=i+","+remaining;
        if(mp.containsKey(key)) return mp.get(key);
        int ans=dfs(i+1,remaining-nums[i])+dfs(i+1,remaining+nums[i]);
        mp.put(key,ans);
        return ans;
    }
    public int findTargetSumWays(int[] nums,int target){
        this.nums=nums;
        this.mp=new HashMap<>();
        return dfs(0,target);
    }
}