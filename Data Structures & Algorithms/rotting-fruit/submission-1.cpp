class Solution {
public:
    int orangesRotting(vector<vector<int>>& grid) {
        queue<pair<int,int>> q;
        vector<pair<int,int>> dir={{1,0},{-1,0},{0,1},{0,-1}};
        int minutes=0;
        int fresh=0;
        for(int r=0;r<grid.size();r++){
            for(int c=0;c<grid[0].size();c++){
                if(grid[r][c]==2){
                    q.push({r,c});
                }else if(grid[r][c]==1){
                    fresh++;
                }
            }
        }
        while(!q.empty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                auto [r,c]=q.front();
                q.pop();
                for(auto [dr,dc]:dir){
                    int nr=r+dr;
                    int nc=c+dc;
                    if(nr>=0&&nr<grid.size()&&nc>=0&&nc<grid[0].size()&&grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        q.push({nr,nc});
                        fresh--;
                    }
                }
            }
            if(!q.empty()) minutes++;
        }
        if(fresh>0) return -1;
        return minutes;
    }
};