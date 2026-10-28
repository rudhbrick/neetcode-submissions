class Solution{
    public ListNode insertionSortList(ListNode head){
        ListNode dummy=new ListNode(0),curr=head;
        while(curr!=null){
            ListNode next=curr.next,prev=dummy;
            while(prev.next!=null&&prev.next.val<curr.val) prev=prev.next;
            curr.next=prev.next;
            prev.next=curr;
            curr=next;
        }
        return dummy.next;
    }
}