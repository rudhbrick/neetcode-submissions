class Solution{
    public TreeNode sortedListToBST(ListNode head){
        if(head==null) return null;
        ListNode prev=null,slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        TreeNode root=new TreeNode(slow.val);
        ListNode rightHead=slow.next;
        if(prev!=null){
            prev.next=null;
            root.left=sortedListToBST(head);
        }
        root.right=sortedListToBST(rightHead);
        return root;
    }
}