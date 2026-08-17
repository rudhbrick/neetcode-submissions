class Solution{
    public long kthLargestLevelSum(TreeNode root,int k){
        Queue<TreeNode> q=new LinkedList<>();
        List<Long> sums=new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            long sum=0;
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                sum+=node.val;
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            sums.add(sum);
        }
        Collections.sort(sums,Collections.reverseOrder());
        if(sums.size()<k) return -1;
        return sums.get(k-1);
    }
}