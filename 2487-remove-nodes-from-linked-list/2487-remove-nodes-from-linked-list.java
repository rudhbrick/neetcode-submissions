class Solution{
    public ListNode removeNodes(ListNode head){
        if(head==null) return null;
        ListNode prev=null,curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=prev;
        int max=prev.val;
        ListNode reverseHead=prev;
        while(prev!=null&&prev.next!=null){
            if(prev.next.val<max){
                prev.next=prev.next.next;
            }else{
                max=prev.next.val;
                prev=prev.next;
            }
        }
        ListNode p1=null,p2=reverseHead;
        while(p2!=null){
            ListNode next=p2.next;
            p2.next=p1;
            p1=p2;
            p2=next;
        }
        return p1;
    }
}