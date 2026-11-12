class Solution{
    List<List<Integer>> ans;
    List<Integer> permutation;
    boolean[] visited;
    int[] nums;
    void backtrack(){
        if(permutation.size()==nums.length){
            ans.add(new ArrayList<>(permutation));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            visited[i]=true;
            permutation.add(nums[i]);
            backtrack();
            permutation.remove(permutation.size()-1);
            visited[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums){
        ans=new ArrayList<>();
        permutation=new ArrayList<>();
        visited=new boolean[nums.length];
        this.nums=nums;
        backtrack();
        return ans;
    }
}