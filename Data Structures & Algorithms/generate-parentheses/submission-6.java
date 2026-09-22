class Solution{
    StringBuilder curr;
    List<String> ans;
    void backtrack(int n,int open,int close){
        if(curr.length()==2*n){
            ans.add(curr.toString());
            return;
        }
        if(open<n){
            curr.append('(');
            backtrack(n,open+1,close);
            curr.deleteCharAt(curr.length()-1);
        }
        if(close<n&&close<open){
            curr.append(')');
            backtrack(n,open,close+1);
            curr.deleteCharAt(curr.length()-1);
        }
    }
    public List<String> generateParenthesis(int n){
        curr=new StringBuilder();
        ans=new ArrayList<>();
        backtrack(n,0,0);
        return ans;
    }
}