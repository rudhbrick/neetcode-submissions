class Solution{
    public int lengthOfLongestSubstring(String s){
        HashSet<Character> st=new HashSet<>();
        int left=0,longest=0;
        for(int right=0;right<s.length();right++){
            while(left<right&&st.contains(s.charAt(right))){
                st.remove(s.charAt(left));
                left++;
            }
            st.add(s.charAt(right));
            int curr=right-left+1;
            longest=Math.max(longest,curr);
        }
        return longest;
    }
}