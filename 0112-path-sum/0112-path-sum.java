class Solution{
    public boolean hasPathSum(TreeNode root,int targetSum){
        if(root==null) return false;
        int remaining=targetSum-root.val;
        if(root.left==null&&root.right==null) return remaining==0;
        return hasPathSum(root.left,remaining)==true||hasPathSum(root.right,remaining)==true;
    }
}