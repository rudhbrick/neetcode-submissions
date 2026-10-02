class Solution{
    boolean isMirror(TreeNode left,TreeNode right){
        if(left==null&&right==null) return true;
        if(left==null&&right!=null||left!=null&&right==null) return false;
        if(left.val==right.val&&isMirror(left.left,right.right)&&isMirror(left.right,right.left)) return true;
        return false;
    }
    public boolean isSymmetric(TreeNode root){
        return isMirror(root.left,root.right);
    }
}