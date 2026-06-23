class Solution {
public:
    bool balanced=true;
    int dfs(TreeNode* root){
        if(root==nullptr){
            return 0;
        }
        int leftHeight=dfs(root->left);
        int rightHeight=dfs(root->right);
        if(leftHeight == -1) return -1;
        if(rightHeight == -1) return -1;
        if(abs(leftHeight - rightHeight) > 1){
            return -1;
        }
        return 1 + max(leftHeight, rightHeight);
    }
    bool isBalanced(TreeNode* root) {
        return dfs(root)!=-1;
    }
};