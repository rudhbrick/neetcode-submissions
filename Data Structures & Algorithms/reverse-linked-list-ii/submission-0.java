class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode before=new ListNode(0);
        before.next=head;
        ListNode prev=before;
        for(int i=1;i<left;i++){
            prev=prev.next;
        }
        ListNode curr=prev.next;
        for(int i=0;i<right-left;i++){
            ListNode next=curr.next;
            curr.next=next.next;
            next.next=prev.next;
            prev.next=next;
        }
        return before.next;
    }
}