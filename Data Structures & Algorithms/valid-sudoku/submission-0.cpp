class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        for(int i=0;i<board.size();i++){
            unordered_set<char> seen;
            for(int j=0;j<board.size();j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(seen.count(board[i][j])){
                    return false;
                }
                seen.insert(board[i][j]);
            }
        }
        for(int i=0;i<board.size();i++){
            unordered_set<char> seen;
            for(int j=0;j<board.size();j++){
                if(board[j][i]=='.'){
                    continue;
                }
                if(seen.count(board[j][i])){
                    return false;
                }
                seen.insert(board[j][i]);
            }
        }
        for(int i=0;i<board.size();i+=3){
            for(int j=0;j<board.size();j+=3){
                unordered_set<char> seen;
                for(int r=i;r<i+3;r++){
                    for(int c=j;c<j+3;c++){
                        if(board[r][c]=='.'){
                            continue;
                        }
                        if(seen.count(board[r][c])){
                            return false;
                        }
                        seen.insert(board[r][c]);
                    }
                }
            }
        }
        return true;
    }
};
