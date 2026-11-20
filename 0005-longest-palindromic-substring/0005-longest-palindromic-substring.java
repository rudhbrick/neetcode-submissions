class Solution{
    String s,longest;
    void helper(int left,int right){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            if(right-left+1>longest.length()) longest=s.substring(left,right+1);
            left--;
            right++;
        }
    }
    public String longestPalindrome(String s){
        this.s=s;
        longest="";
        for(int i=0;i<s.length();i++){
            helper(i,i);
            helper(i,i+1);
        }
        return longest;
    }
}