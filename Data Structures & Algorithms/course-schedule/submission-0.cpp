class Solution {
public:
    vector<vector<int>> graph;
    vector<int> state;
    bool dfs(int course){    
        if(state[course]==1) return false;
        if(state[course]==2) return true;
        state[course]=1;
        for(int next:graph[course]){
            if(!dfs(next)) return false;
        }
        state[course]=2;
        return true;
    }
    bool canFinish(int numCourses, vector<vector<int>>& prerequisites){
        graph.resize(numCourses);
        state.resize(numCourses);
        for(auto& pre:prerequisites){
            graph[pre[1]].push_back(pre[0]);
        }
        for(int i=0;i<numCourses;i++){
            if(state[i]==0){
                if(!dfs(i)) return false;
            }
        }
        return true;
    }
};