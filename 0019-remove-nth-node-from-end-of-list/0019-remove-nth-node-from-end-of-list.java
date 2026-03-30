class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //calculate the size first
        ListNode temp=head;
        int sz=0;

        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return head;
        }

        int i=1;
        int iToFind=sz-n;
        ListNode prev=head;

        while(i<iToFind){

            prev=prev.next;
            i++;

            
        }

        prev.next=prev.next.next;

        return head;
        
    }
}