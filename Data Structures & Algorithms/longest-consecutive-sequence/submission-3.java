class Solution{
    public int longestConsecutive(int[] nums){
        HashSet<Integer> st=new HashSet<>();
        for(int i:nums) st.add(i);
        int currNum,currLen,longest=0;
        for(int x:st){
            if(!st.contains(x-1)){
                currNum=x;
                currLen=1;
                while(st.contains(currNum+1)){
                    currNum++;
                    currLen++;
                }
                longest=Math.max(longest,currLen);
            }
        }
        return longest;
    }
}