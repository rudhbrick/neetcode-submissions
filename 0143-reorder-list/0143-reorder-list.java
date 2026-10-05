class Solution{
    public void reorderList(ListNode head){
        ListNode slow=head,fast=head,first=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=slow.next;
        slow.next=null;
        ListNode prev=null,curr=second;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        second=prev;
        while(second!=null){
            ListNode firstNext=first.next;
            ListNode secondNext=second.next;
            first.next=second;
            second.next=firstNext;
            first=firstNext;
            second=secondNext;
        }
    }
}