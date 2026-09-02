class Solution{
    public List<Integer> postorderTraversal(TreeNode root){
        Stack<TreeNode> st=new Stack<>();
        List<Integer> result=new ArrayList<>();
        if(root!=null) st.push(root);
        while(!st.isEmpty()){
            TreeNode node=st.pop();
            result.add(node.val);
            if(node.left!=null) st.push(node.left);
            if(node.right!=null) st.push(node.right);
        }
        Collections.reverse(result);
        return result;
    }
}