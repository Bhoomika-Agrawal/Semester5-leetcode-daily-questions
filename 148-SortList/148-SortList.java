// Last updated: 7/31/2025, 2:14:48 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid = Middle(head);
        ListNode midnext = mid.next;
        mid.next = null;
        ListNode A = sortList(head);
        ListNode B = sortList(midnext);
        return merge_lists(A,B);
    }
    public ListNode Middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    } 
    public ListNode merge_lists(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                dummy.next = list1;
                list1 = list1.next;
                dummy = dummy.next;
            }
            else{
                dummy.next = list2;
                list2 = list2.next;
                dummy = dummy.next;
            }
        }
        if(list1==null){
            dummy.next = list2;
        }
        if(list2==null){
            dummy.next = list1;
        }
        return temp.next;
    }
}