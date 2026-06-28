class Solution {
public:
    unordered_map<Node*,Node*> mp;
    Node* dfs(Node* node){
        if(node==nullptr){
            return nullptr;
        }
        if(mp.count(node)){
            return mp[node];
        }
        Node* clone=new Node(node->val);
        mp[node]=clone;
        for(Node* neighbor:node->neighbors){
            clone->neighbors.push_back(dfs(neighbor));
        }
        return clone;
    }
    Node* cloneGraph(Node* node){
        return dfs(node);
    }
};