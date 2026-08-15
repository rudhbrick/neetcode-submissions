class Solution{
    ListNode head;
    Random rand;
    int size;
    public Solution(ListNode head){
        this.head=head;
        ListNode curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        rand=new Random();
    }
    public int getRandom(){
        int index=rand.nextInt(size);
        ListNode curr=head;
        for(int i=0;i<index;i++){
            curr=curr.next;
        }
        return curr.val;
    }
}