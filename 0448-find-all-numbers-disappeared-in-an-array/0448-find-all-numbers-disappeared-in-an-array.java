class Solution{
    public List<Integer> findDisappearedNumbers(int[] nums){
        HashSet<Integer> st=new HashSet<>();
        List<Integer> ans=new ArrayList<>();
        for(int x:nums) st.add(x);
        for(int i=1;i<=nums.length;i++) if(!st.contains(i)) ans.add(i);
        return ans;
    }
}