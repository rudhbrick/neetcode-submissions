class Solution {
public:
    bool dfs(int current,int target,vector<vector<int>>& graph,vector<bool>& visited){
        if(current==target) return true;
        if(visited[current]) return false;
        visited[current]=true;
        for(int next:graph[current]){
            if(dfs(next,target,graph,visited)) return true;
        }
        return false;
    }
    vector<int> findRedundantConnection(vector<vector<int>>& edges){
        int n=edges.size();
        vector<vector<int>> graph(n + 1);
        for(auto& edge:edges){
            int u=edge[0];
            int v=edge[1];
            vector<bool> visited(n+1,false);
            if(dfs(u,v,graph,visited)) return{u,v};
            graph[u].push_back(v);
            graph[v].push_back(u);
        }
        return {};
    }
};