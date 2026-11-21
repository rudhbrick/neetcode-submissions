class Solution{
    public ListNode deleteMiddle(ListNode head){
        if(head==null||head.next==null) return null;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy,slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            prev=prev.next;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=prev.next.next;
        return dummy.next;
    }
}