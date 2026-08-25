class Solution{
    public void dfs(int[][] isConnected,boolean[] visited,int city){
        visited[city]=true;
        for(int j=0;j<isConnected.length;j++) if(isConnected[city][j]==1&&!visited[j]) dfs(isConnected,visited,j);
    }
    public int findCircleNum(int[][] isConnected){
        boolean[] visited=new boolean[isConnected.length];
        int provinces=0;
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                provinces++;
                dfs(isConnected,visited,i);
            }
        }
        return provinces;
    }
}