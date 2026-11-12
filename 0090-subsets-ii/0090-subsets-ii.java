class Solution{
    List<List<Integer>> ans;
    List<Integer> subset;
    int[] nums;
    void backtrack(int index){
        ans.add(new ArrayList<>(subset));
        for(int i=index;i<nums.length;i++){
            if(i>index&&nums[i]==nums[i-1]) continue;
            subset.add(nums[i]);
            backtrack(i+1);
            subset.remove(subset.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums){
        ans=new ArrayList<>();
        subset=new ArrayList<>();
        this.nums=nums;
        Arrays.sort(nums);
        backtrack(0);
        return ans;
    }
}