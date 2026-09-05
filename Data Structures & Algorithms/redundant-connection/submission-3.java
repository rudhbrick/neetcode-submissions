class Solution{
    int[] parent;
    int find(int x){
        if(parent[x]==x) return x;
        return parent[x]=find(parent[x]);
    }
    void unionFind(int x,int y){
        int root1=find(x);
        int root2=find(y);
        if(root1!=root2) parent[root2]=root1;
    }
    public int[] findRedundantConnection(int[][] edges){
        int n=edges.length;
        parent=new int[n+1];
        for(int i=0;i<=n;i++) parent[i]=i;
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            if(find(u)==find(v)) return edge;
            unionFind(u,v);
        }
        return new int[]{};
    }
}