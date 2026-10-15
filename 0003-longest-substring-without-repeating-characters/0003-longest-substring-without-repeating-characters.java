class Solution{
    public int lengthOfLongestSubstring(String s){
        HashSet<Character> st=new HashSet<>();
        int best=0,left=0;
        for(int right=0;right<s.length();right++){
            while(st.contains(s.charAt(right))){
                st.remove(s.charAt(left));
                left++;
            }
            st.add(s.charAt(right));
            int curr=right-left+1;
            best=Math.max(best,curr);
        }
        return best;
    }
}