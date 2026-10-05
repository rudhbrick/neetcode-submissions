class Solution{
    public ListNode rotateRight(ListNode head,int k){
        if(head==null||head.next==null||k==0) return head;
        ListNode tail=head;
        int n=1;
        while(tail.next!=null){
            tail=tail.next;
            n++;
        }
        k%=n;
        if(k==0) return head;
        ListNode newTail=head;
        for(int i=1;i<n-k;i++) newTail=newTail.next;
        ListNode newHead=newTail.next;
        tail.next=head;
        newTail.next=null;
        return newHead;
    }
}