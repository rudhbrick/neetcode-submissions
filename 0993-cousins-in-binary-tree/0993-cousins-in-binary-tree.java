class Solution{
    int xDepth=-1;
    int yDepth=-1;
    TreeNode xParent=null;
    TreeNode yParent=null;
    void dfs(TreeNode root,TreeNode parent,int depth,int x,int y){
        if(root==null) return;
        if(root.val==x){
            xDepth=depth;
            xParent=parent;
        }
        if(root.val==y){
            yDepth=depth;
            yParent=parent;
        }
        dfs(root.left,root,depth+1,x,y);
        dfs(root.right,root,depth+1,x,y);
    }
    public boolean isCousins(TreeNode root,int x,int y){
        dfs(root,root,0,x,y);
        return xDepth==yDepth&&xParent!=yParent;
    }
}