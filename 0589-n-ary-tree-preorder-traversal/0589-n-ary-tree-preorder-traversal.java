class Solution{
    public List<Integer> preorder(Node root){
        Stack<Node> st=new Stack<>();
        List<Integer> result=new ArrayList<>();
        if(root!=null) st.push(root);
        while(!st.isEmpty()){
            Node node=st.pop();
            result.add(node.val);
            for(int i=node.children.size()-1;i>=0;i--){
                st.push(node.children.get(i));
            }
        }
        return result;
    }
}