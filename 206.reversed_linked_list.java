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
 //solving using 3 pointers approach-previous,current,future
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode p=null;
        ListNode c=head;
        while(c!=null){
            ListNode f=c.next;//may be null in future hence placed inside while
            c.next=p;//direct the link of current node to the previous node
            p=c;//move the position of previous node to the current node
            c=f;//move the current node to the future node
        }
        return p;//since previous is being updated till the end we return previous
    }
}
