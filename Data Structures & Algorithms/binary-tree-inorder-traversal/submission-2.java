class Solution{
    public List<Integer> inorderTraversal(TreeNode root){
        Stack<TreeNode> st=new Stack<>();
        List<Integer> result=new ArrayList<>();
        TreeNode curr=root;
        while(curr!=null||!st.isEmpty()){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            result.add(curr.val);
            curr=curr.right;
        }
        return result;
    }
}