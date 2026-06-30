class Solution {
public:
    void dfs(vector<vector<int>>& heights,vector<vector<bool>>& visited,int r, int c,int prevHeight){
        if(r<0||r>=heights.size()||c<0||c>=heights[0].size()) return;
        if(visited[r][c]) return;
        if(heights[r][c]<prevHeight) return;
        visited[r][c]=true;
        dfs(heights,visited, r+1, c, heights[r][c]);
        dfs(heights,visited, r-1, c, heights[r][c]);
        dfs(heights,visited, r, c+1, heights[r][c]);
        dfs(heights,visited, r, c-1, heights[r][c]);
    }
    vector<vector<int>> pacificAtlantic(vector<vector<int>>& heights){
        if(heights.empty()) return{};
        int rows=heights.size();
        int cols=heights[0].size();
        vector<vector<bool>> pacific(rows,vector<bool>(cols,false));
        vector<vector<bool>> atlantic(rows,vector<bool>(cols,false));
        vector<vector<int>> ans;
        for(int r=0;r<heights.size();r++){
            dfs(heights,pacific,r,0,heights[r][0]);
            dfs(heights,atlantic,r,cols-1,heights[r][cols-1]);
        }
        for(int c=0;c<heights[0].size();c++){
            dfs(heights,pacific,0,c,heights[0][c]);
            dfs(heights,atlantic,rows-1,c,heights[rows-1][c]);
        }
        for(int r=0;r<heights.size();r++){
            for(int c=0;c<heights[0].size();c++){
                if(pacific[r][c]&&atlantic[r][c]){
                    ans.push_back({r,c});
                }
            }
        }
        return ans;
    }
};