class Solution{
    boolean balanced=true;
    int dfs(TreeNode root){
        if(root==null) return 0;
        int leftHeight=dfs(root.left);
        int rightHeight=dfs(root.right);
        if(leftHeight==-1||rightHeight==-1||Math.abs(leftHeight-rightHeight)>1) return -1;
        return 1+Math.max(leftHeight,rightHeight);
    }
    public boolean isBalanced(TreeNode root){
        return dfs(root)!=-1;
    }
}