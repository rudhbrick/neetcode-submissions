class Solution {
public:
    void reorderList(ListNode* head) {
        if(!head||!head->next) return;
        ListNode* slow=head;
        ListNode* fast=head->next;
        ListNode* first=head;
        while(fast&&fast->next){
            slow=slow->next;
            fast=fast->next->next;
        }
        ListNode* second = slow->next;
        slow->next = nullptr;
        ListNode* prev=nullptr;
        ListNode* curr=second;
        while(curr){
            ListNode* next=curr->next;
            curr->next=prev;
            prev=curr;
            curr=next;
        }
        ListNode* tmp1 = first->next;
        ListNode* tmp2 = second->next;
        second=prev;
        while(second){
            tmp1=first->next;
            tmp2=second->next;
            first->next = second;
            second->next=tmp1;
            first=tmp1;
            second=tmp2;
        }
    }
};