class Solution{
    public ListNode partition(ListNode head,int x){
        ListNode lessDummy=new ListNode(0),moreDummy=new ListNode(0);
        ListNode less=lessDummy,more=moreDummy,curr=head;
        while(curr!=null){
            if(curr.val<x){
                less.next=curr;
                less=less.next;
            }else{
                more.next=curr;
                more=more.next;
            }
            curr=curr.next;
        }
        less.next=moreDummy.next;
        more.next=null;
        return lessDummy.next;
    }
}