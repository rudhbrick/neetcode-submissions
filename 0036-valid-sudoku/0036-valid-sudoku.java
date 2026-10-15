class Solution{
    public boolean isValidSudoku(char[][] board){
        for(int i=0;i<9;i++){
            HashSet<Character> st=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                if(!st.add(board[i][j])) return false;
            }
        }
        for(int i=0;i<9;i++){
            HashSet<Character> st=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.') continue;
                if(!st.add(board[j][i])) return false;
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                HashSet<Character> st=new HashSet<>();
                for(int r=i;r<i+3;r++){
                    for(int c=j;c<j+3;c++){
                        if(board[r][c]=='.') continue;
                        if(!st.add(board[r][c])) return false;
                    }
                }
            }
        }
        return true;
    }
}