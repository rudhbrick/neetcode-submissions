class Solution{
    boolean isMirror(TreeNode left,TreeNode right){
        if(left==null&&right==null) return true;
        if(left==null&&right!=null||left!=null&&right==null) return false;
        if(left.val==right.val&&isMirror(left.left,right.right)==true&&isMirror(left.right,right.left)) return true;
        return false;
    }
    public boolean isSymmetric(TreeNode root){
        if(root==null) return true;
        return isMirror(root.left,root.right);
    }
}