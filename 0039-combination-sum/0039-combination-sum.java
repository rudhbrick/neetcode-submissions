class Solution{
    List<List<Integer>> ans;
    int[] candidates;
    List<Integer> combination;
    void backtrack(int index,int remaining){
        if(remaining==0){
            ans.add(new ArrayList<>(combination));
            return;
        }if(remaining<0||index==candidates.length) return;
        combination.add(candidates[index]);
        backtrack(index,remaining-candidates[index]);
        combination.remove(combination.size()-1);
        backtrack(index+1,remaining);
    }
    public List<List<Integer>> combinationSum(int[] candidates,int target){
        ans=new ArrayList<>();
        combination=new ArrayList<>();
        this.candidates=candidates;
        backtrack(0,target);
        return ans;
    }
}