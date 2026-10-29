class Solution{
    public List<Integer> inorderTraversal(TreeNode root){
        Stack<TreeNode> st=new Stack<>();
        List<Integer> ans=new ArrayList<>();
        TreeNode curr=root;
        while(curr!=null||!st.isEmpty()){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            ans.add(curr.val);
            curr=curr.right;
        }
        return ans;
    }
}