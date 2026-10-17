class Solution{
    String s;
    int count;
    void helper(int left,int right){
        int n=s.length();
        while(left>=0&&right<n&&s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
    }
    public int countSubstrings(String s){
        this.s=s;
        this.count=0;
        for(int i=0;i<s.length();i++){
            helper(i,i);
            helper(i,i+1);
        }
        return count;
    }
}