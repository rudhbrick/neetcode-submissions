class Solution{
    int second=-1;
    public void dfs(TreeNode root,int min){
        if(root==null) return;
        if(root.val>min){
            if(second==-1||root.val<second) second=root.val;
        }
        dfs(root.right,min);
        dfs(root.left,min);
    }
    public int findSecondMinimumValue(TreeNode root){
        int min=root.val;
        dfs(root,min);
        return second;
    }
}