class Solution {
public:
    bool dfs(vector<vector<char>>& board,int r,int c,int index,string word){
        if(r<0||r>=board.size()||c<0||c>=board[0].size()) return false;
        if(board[r][c]!=word[index]) return false;
        if(index==word.size()-1) return true;
        char temp=board[r][c];
        board[r][c]='#';
        bool found = dfs(board,r+1,c,index+1,word)||dfs(board,r-1,c,index+1,word)||dfs(board,r,c+1,index+1,word)||dfs(board,r,c-1,index+1,word);
        board[r][c]=temp;
        return found;
    }
    bool exist(vector<vector<char>>& board, string word){
        for(int r=0;r<board.size();r++){
            for(int c=0;c<board[0].size();c++){
                if(dfs(board,r,c,0,word)) return true;
            }
        }
        return false;
    }
};