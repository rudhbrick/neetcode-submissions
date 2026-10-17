class Solution{
    String s,longest;
    void helper(int left,int right){
        int n=s.length();
        while(left>=0&&right<n&&s.charAt(left)==s.charAt(right)){
            if(right-left+1>longest.length()) longest=s.substring(left,right+1);
            left--;
            right++;
        }
    }
    public String longestPalindrome(String s){
        this.s=s;
        this.longest="";
        for(int i=0;i<s.length();i++){
            helper(i,i);
            helper(i,i+1);
        }
        return longest;
    }
}