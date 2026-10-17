class Solution{
    public boolean wordBreak(String s,List<String> wordDict){
        HashSet<String> st=new HashSet<>(wordDict);
        int n=s.length();
        boolean[] dp=new boolean[n+1];
        dp[n]=true;
        for(int i=n-1;i>=0;i--){
            for(int end=i;end<n;end++){
                String str=s.substring(i,end+1);
                if(st.contains(str)&&dp[end+1]){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[0];
    }
}