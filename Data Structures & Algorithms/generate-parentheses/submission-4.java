class Solution{
    StringBuilder current;
    List<String> ans;
    public void backtrack(int n,int open,int close){
        if(current.length()==2*n){
            ans.add(current.toString());
            return;
        }
        if(open<n){
            current.append('(');
            backtrack(n,open+1,close);
            current.deleteCharAt(current.length()-1);
        }
        if(close<n&&close<open){
            current.append(')');
            backtrack(n,open,close+1);
            current.deleteCharAt(current.length()-1);
        }
    }
    public List<String> generateParenthesis(int n){
        current=new StringBuilder();
        ans=new ArrayList<>();
        backtrack(n,0,0);
        return ans;
    }
}