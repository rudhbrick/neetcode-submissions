class Solution{
    int dfs(TreeNode root,int maxSoFar){
        if(root==null) return 0;
        int good=0;
        if(root.val>=maxSoFar) good=1;
        maxSoFar=Math.max(maxSoFar,root.val);
        int left=dfs(root.left,maxSoFar),right=dfs(root.right,maxSoFar);
        return good+left+right;
    }
    public int goodNodes(TreeNode root){
        return dfs(root,root.val);
    }
}