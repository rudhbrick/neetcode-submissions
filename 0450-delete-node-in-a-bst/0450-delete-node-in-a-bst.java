class Solution{
    TreeNode findMax(TreeNode root){
        while(root.right!=null) root=root.right;
        return root;
    }
    public TreeNode deleteNode(TreeNode root,int key){
        if(root==null) return null;
        if(key<root.val) root.left=deleteNode(root.left,key);
        if(key>root.val) root.right=deleteNode(root.right,key);
        if(key==root.val){
            if(root.left==null&&root.right==null){
                root=null;
            }else if(root.left!=null&&root.right==null){
                root=root.left;
            }else if(root.left==null&&root.right!=null){
                root=root.right;
            }else{
                TreeNode predecessor=findMax(root.left);
                root.val=predecessor.val;
                root.left=deleteNode(root.left,predecessor.val);
            }
        }
        return root;
    }
}