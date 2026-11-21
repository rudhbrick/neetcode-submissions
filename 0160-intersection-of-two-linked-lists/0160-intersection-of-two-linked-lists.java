public class Solution{
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        ListNode a=headA,b=headB;
        while(a!=b){
            a=a==null?headA:a.next;
            b=b==null?headB:b.next;
        }
        return a;
    }
}