class Solution {
public:
    vector<vector<int>> graph;
    vector<int> state;
    vector<int> result;
    bool dfs(int course){    
        if(state[course]==1) return false;
        if(state[course]==2) return true;
        state[course]=1;
        for(int next:graph[course]){
            if(!dfs(next)) return false;
        }
        state[course]=2;
        result.push_back(course);
        return true;
    }
    vector<int> findOrder(int numCourses, vector<vector<int>>& prerequisites) {
        graph.resize(numCourses);
        state.resize(numCourses);
        for(auto& pre:prerequisites){
            graph[pre[1]].push_back(pre[0]);
        }
        for(int i=0;i<numCourses;i++){
            if(state[i]==0){
                if(!dfs(i)) return {};
            }
        }
        reverse(result.begin(), result.end());
        return result;
    }
};