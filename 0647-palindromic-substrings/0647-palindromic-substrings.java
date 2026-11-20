class Solution{
    String s;
    int count;
    void helper(int left,int right){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
    }
    public int countSubstrings(String s){
        this.s=s;
        count=0;
        for(int i=0;i<s.length();i++){
            helper(i,i);
            helper(i,i+1);
        }
        return count;
    }
}