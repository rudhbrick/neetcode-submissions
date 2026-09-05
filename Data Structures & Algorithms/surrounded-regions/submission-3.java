class Solution{
    void dfs(char[][] board,int r,int c){
        if(r<0||r>=board.length||c<0||c>=board[0].length||board[r][c]!='O') return;
        board[r][c]='T';
        dfs(board,r+1,c);
        dfs(board,r-1,c);
        dfs(board,r,c+1);
        dfs(board,r,c-1);
    }
    public void solve(char[][] board){
        int rows=board.length,cols=board[0].length;
        for(int r=0;r<board.length;r++){
            dfs(board,r,0);
            dfs(board,r,cols-1);
        }
        for(int c=0;c<board[0].length;c++){
            dfs(board,0,c);
            dfs(board,rows-1,c);
        }
        for(int r=0;r<board.length;r++){
            for(int c=0;c<board[0].length;c++){
                if(board[r][c]=='O'){
                    board[r][c]='X';
                }else if(board[r][c]=='T'){
                    board[r][c]='O';
                }
            }
        }
    }
}