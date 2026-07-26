class Solution{
    public int longestConsecutive(int[] nums){
        HashSet<Integer> st=new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        int currentNum;
        int currentLen;
        int longest=0;
        for(int x:st){
            if(!st.contains(x-1)){
                currentNum=x;
                currentLen=1;
                while(st.contains(currentNum+1)){
                    currentNum++;
                    currentLen++;
                }
                longest=Math.max(longest,currentLen);
            }
        }
        return longest;
    }
}