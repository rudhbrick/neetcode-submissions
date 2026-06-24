class Solution {
public:
    bool dfs(TreeNode* root,long min,long max){
        if(!root) return true;
        if(root->val<=min||root->val>=max){
            return false;
        }
        int left=dfs(root->left,min,root->val);
        int right=dfs(root->right,root->val,max);
        return left&&right;
    }
    bool isValidBST(TreeNode* root){
        return dfs(root,LONG_MIN,LONG_MAX);
    }
};