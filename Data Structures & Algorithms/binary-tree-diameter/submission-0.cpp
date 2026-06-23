class Solution {
public:
    int diameter=0;
    int dfs(TreeNode* root){
        if(root==nullptr){
            return 0;
        }
        int leftHeight=dfs(root->left);
        int rightHeight=dfs(root->right);
        diameter=max(diameter,leftHeight+rightHeight);
        return 1+max(leftHeight,rightHeight);
    }
    int diameterOfBinaryTree(TreeNode* root) {
        dfs(root);
        return diameter;
    }
};