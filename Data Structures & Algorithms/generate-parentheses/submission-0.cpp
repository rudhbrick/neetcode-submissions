class Solution {
public:
    string current;
    vector<string> ans;
    int n;
    void backtrack(int open,int close){
        if(current.length()==2*n){
            ans.push_back(current);
            return;
        }
        if(open<n){
            current.push_back('(');
            backtrack(open+1,close);
            current.pop_back();
        }
        if(close<open){
            current.push_back(')');
            backtrack(open,close+1);
            current.pop_back();
        }
    }
    vector<string> generateParenthesis(int n){
        ans.clear();
        this->n=n;
        backtrack(0,0);
        return ans;
    }
};