class Solution{
    public TreeNode sortedListToBST(ListNode head){
        if(head==null) return null;
        ListNode prev=null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(prev!=null) prev.next=null;
        TreeNode root=new TreeNode(slow.val);
        if(prev==null){
            root.left=null;
        }else{
            prev.next=null;
            root.left=sortedListToBST(head);
        }
        ListNode rightHead=slow.next;
        root.right=sortedListToBST(rightHead);
        return root;
    }
}