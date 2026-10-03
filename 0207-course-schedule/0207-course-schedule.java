class Solution{
    List<List<Integer>> graph;
    int[] state;
    boolean dfs(int course){
        if(state[course]==1) return false;
        if(state[course]==2) return true;
        state[course]=1;
        for(int next:graph.get(course)) if(!dfs(next)) return false;
        state[course]=2;
        return true;
    }
    public boolean canFinish(int numCourses,int[][] prerequisites){
        graph=new ArrayList<>();
        state=new int[numCourses];
        for(int i=0;i<numCourses;i++) graph.add(new ArrayList<>());
        for(int[] pre:prerequisites) graph.get(pre[1]).add(pre[0]);
        for(int i=0;i<numCourses;i++) if(state[i]==0) if(!dfs(i)) return false;
        return true;
    }
}