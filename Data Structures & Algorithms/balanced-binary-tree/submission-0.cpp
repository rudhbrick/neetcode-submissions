class Solution {
public:
    bool balanced=true;
    int dfs(TreeNode* root){
        if(root==nullptr){
            return 0;
        }
        int leftHeight=dfs(root->left);
        int rightHeight=dfs(root->right);
        if(abs(leftHeight - rightHeight) > 1){
            balanced = false;
        }
        return 1 + max(leftHeight, rightHeight);
    }
    bool isBalanced(TreeNode* root) {
        dfs(root);
        return balanced;
    }
};