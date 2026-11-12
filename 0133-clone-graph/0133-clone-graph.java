class Solution{
    HashMap<Node,Node> mp;
    Node dfs(Node node){
        if(node==null) return null;
        if(mp.containsKey(node)) return mp.get(node);
        Node clone=new Node(node.val);
        mp.put(node,clone);
        for(Node neighbor:node.neighbors) clone.neighbors.add(dfs(neighbor));
        return clone;
    }
    public Node cloneGraph(Node node){
        mp=new HashMap<>();
        return dfs(node);
    }
}