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

//�ж��������, L != null && L.next != null
//�����һ��������е㣺����һ����������θ�Ч���ҵ�������е㣬Ҫ���㷨���Ӷ�O��N�����е��������ʹ�ÿ���ָ��ʵ�֣���ָ��һ���ƶ�һ���ڵ㣬��ڵ�һ���ƶ������ڵ㣬��ָ�뵽���յ�ʱ����ָ��ָ���е㡣

//�����㷨�� 
//���ڸ��������ݽṹ�ǵ�����Ҫ���������β��Ԫ�أ������ͷ��ʼ������Ϊ�˷����жϣ����ǿ�������һ������ջ�ṹ���洢��������ݣ���һ�α���������ڵ�ֵ������ջ���ڶ��α����Ƚ��ж��Ƿ�Ϊ���ġ� 