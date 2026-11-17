class Solution{
    int dfs(TreeNode root,int max){
        if(root==null) return 0;
        int good=0;
        if(root.val>=max) good=1;
        max=Math.max(max,root.val);
        int left=dfs(root.left,max),right=dfs(root.right,max);
        return good+left+right;
    }
    public int goodNodes(TreeNode root){
        return dfs(root,root.val);
    }
}