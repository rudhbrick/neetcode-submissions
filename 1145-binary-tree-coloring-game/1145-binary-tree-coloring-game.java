class Solution{
    int leftSize=0;
    int rightSize=0;
    int dfs(TreeNode root,int x){
        if(root==null) return 0;
        int left=dfs(root.left,x);
        int right=dfs(root.right,x);
        if(root.val==x){
            leftSize=left;
            rightSize=right;
        }
        return 1+left+right;
    }
    public boolean btreeGameWinningMove(TreeNode root,int n,int x){
        dfs(root,x);
        int parentSize=n-leftSize-rightSize-1;
        return Math.max(Math.max(leftSize,rightSize),parentSize)>n/2;
    }
}