class Solution{
    int dfs(TreeNode root){
        if(root==null) return 0;
        int left=dfs(root.left),right=dfs(root.right);
        if(left==-1) return -1;
        if(right==-1) return -1;
        if(Math.abs(left-right)>1) return -1;
        return 1+Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root){
        return dfs(root)!=-1;
    }
}