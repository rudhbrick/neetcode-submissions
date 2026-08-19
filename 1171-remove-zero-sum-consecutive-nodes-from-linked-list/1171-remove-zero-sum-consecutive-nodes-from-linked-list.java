class Solution{
    public ListNode removeZeroSumSublists(ListNode head){
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        HashMap<Integer,ListNode> mp=new HashMap<>();
        int sum=0;
        ListNode curr=dummy;
        while(curr!=null){
            sum+=curr.val;
            mp.put(sum,curr);
            curr=curr.next;
        }
        sum=0;
        curr=dummy;
        while(curr!=null){
            sum+=curr.val;
            curr.next=mp.get(sum).next;
            curr=curr.next;
        }
        return dummy.next;
    }
}