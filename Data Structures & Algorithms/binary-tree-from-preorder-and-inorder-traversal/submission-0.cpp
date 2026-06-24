class Solution {
public:
    vector<int> preorder;
    vector<int> inorder;
    unordered_map<int,int> mp;
    TreeNode* build(int preLeft,int preRight,int inLeft,int inRight){
        if(preLeft>preRight) return nullptr;
        int rootVal=preorder[preLeft];
        TreeNode* root=new TreeNode(rootVal);
        int mid=mp[rootVal];
        int leftSize=mid-inLeft;
        root->left=build(preLeft+1,preLeft+leftSize,inLeft,mid-1);
        root->right=build(preLeft+leftSize+1,preRight,mid+1,inRight);
        return root;
    }
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder){
        this->preorder=preorder;
        this->inorder=inorder;
        for(int i=0;i<inorder.size();i++){
            mp[inorder[i]]=i;
        }
        return build(0,preorder.size()-1,0,inorder.size()-1);
    }
};