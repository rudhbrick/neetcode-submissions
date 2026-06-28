class Solution {
public:
    void islandsAndTreasure(vector<vector<int>>& grid){
        queue<pair<int,int>> q;
        vector<pair<int,int>> directions ={{1,0},{-1,0},{0,1},{0,-1}};
        for(int r=0;r<grid.size();r++){
            for(int c=0;c<grid[0].size();c++){
                if(grid[r][c]==0){
                    q.push({r,c});
                }
            }
        }
        while(!q.empty()){
            auto [r,c] = q.front();
            q.pop();
            for(auto [dr,dc]:directions){
                int nr=r+dr;
                int nc=c+dc;
                if(nr>=0&&nr<grid.size()&&nc>=0&&nc<grid[0].size()&&grid[nr][nc]==2147483647){
                    grid[nr][nc]=grid[r][c]+1;
                    q.push({nr,nc});
                }
            }
        }
    }
};