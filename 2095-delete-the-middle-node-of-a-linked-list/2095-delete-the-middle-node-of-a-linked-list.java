class Solution{
    public ListNode deleteMiddle(ListNode head){
        if(head==null||head.next==null) return null;
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode n=head;
        while(n.next!=slow) n=n.next;
        n.next=n.next.next;
        return head;
    }
}