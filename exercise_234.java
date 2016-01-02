/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if(head == null)
            return true;
        
        ListNode mid = null;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        mid = slow;
        ListNode head1 = head;
        ListNode head2 = reverseList(mid);
        
        while(head2 != null && head2.next != null){
            if(head2.val != head1.val)
                return false;
            head2 = head2.next;
            head1 = head1.next;
        }
        return true;
    }
    
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null)
            return head;
        ListNode nextNode = head.next;
        ListNode newHead = reverseList(nextNode);
        nextNode.next = head;
        head.next = null;
        return newHead;
    }
}

//判断链表存在, L != null && L.next != null
//如何找一个链表的中点：给定一个单链表如何高效的找到链表的中点，要求算法复杂度O（N）。中点问题可以使用快慢指针实现，慢指针一次移动一个节点，快节点一次移动两个节点，快指针到达终点时，慢指针指向中点。

//朴素算法。 
//由于给定的数据结构是单链表，要访问链表的尾部元素，必须从头开始遍历。为了方便判断，我们可以申请一个辅助栈结构来存储链表的内容，第一次遍历将链表节点值依次入栈，第二次遍历比较判断是否为回文。 