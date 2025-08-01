// Last updated: 7/31/2025, 2:16:10 PM
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                dummy.next=list1;
                dummy=dummy.next;
                list1=list1.next;
            }
            else{
                dummy.next=list2;
                dummy=dummy.next;
                list2=list2.next;
            }
        }
        if(list1==null){
            dummy.next=list2;
        }
        if(list2==null){
            dummy.next=list1;
        }
        return temp.next;
    }
}