class Solution{
    public List<Integer> postorder(Node root){
        Stack<Node> st=new Stack<>();
        List<Integer> result=new ArrayList<>();
        if(root!=null) st.push(root);
        while(!st.isEmpty()){
            Node node=st.pop();
            result.add(node.val);
            for(Node child:node.children) st.push(child);
        }
        Collections.reverse(result);
        return result;
    }
}