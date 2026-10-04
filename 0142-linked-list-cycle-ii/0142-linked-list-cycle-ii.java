public class Solution{
    public ListNode detectCycle(ListNode head){
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                ListNode tail=head;
                while(tail!=slow){
                    tail=tail.next;
                    slow=slow.next;
                }
                return tail;
            }
        }
        return null;
    }
}