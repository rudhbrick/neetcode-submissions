class Solution{
    List<List<Integer>> ans;
    List<Integer> subset;
    int[] nums;
    void backtrack(int index){
        if(index==nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        backtrack(index+1);
        subset.remove(subset.size()-1);
        backtrack(index+1);
    }
    public List<List<Integer>> subsets(int[] nums){
        ans=new ArrayList<>();
        subset=new ArrayList<>();
        this.nums=nums;
        backtrack(0);
        return ans;
    }
}