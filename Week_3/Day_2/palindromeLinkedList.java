class Solution {
    private ListNode reverse(ListNode nh){
        ListNode current=nh;
        ListNode prev=null;
        while(current!=null){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
    
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
            ListNode newhead=reverse(slow);
            ListNode first=head;
            ListNode second=newhead;
            while(second!=null){
                if(first.val != second.val){
                    reverse(newhead);
                    return false;
                }
                first=first.next;
                second=second.next;
            }
        reverse (newhead);
            return true;
    }
}