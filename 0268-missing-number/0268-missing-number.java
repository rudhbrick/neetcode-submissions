class Solution{
    public int missingNumber(int[] nums){
        HashSet<Integer> st=new HashSet<>();
        for(int num:nums) st.add(num);
        for(int x:st){
            if(x==1&&!st.contains(0)) return 0;
            if(!st.contains(x+1)) return x+1;
        }
        return 0;
    }
}