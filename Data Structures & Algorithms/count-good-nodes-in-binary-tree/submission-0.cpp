class Solution {
public:
    int dfs(TreeNode* root,int maxSoFar){
        if(!root) return 0;
        int goodHere=0;
        if(root->val>=maxSoFar){
            goodHere=1;
        }
        maxSoFar=max(root->val,maxSoFar);
        int left=dfs(root->left,maxSoFar);
        int right=dfs(root->right,maxSoFar);
        return goodHere+left+right;
    }
    int goodNodes(TreeNode* root) {
        return dfs(root,root->val);
    }
};