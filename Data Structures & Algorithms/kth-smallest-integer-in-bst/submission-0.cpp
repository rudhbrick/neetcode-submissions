class Solution {
public:
    int count=0;
    int answer;
    void dfs(TreeNode* root,int k){
        if(!root) return;
        dfs(root->left,k);
        count++;
        if(count==k){
            answer=root->val;
            return;
        }
        dfs(root->right,k);
    }
    int kthSmallest(TreeNode* root, int k) {
        dfs(root,k);
        return answer;
    }
};