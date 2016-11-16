public ListNode insertSortedList(ListNode head, int value){ //������Ҫ����ָ��
	
	ListNode node = new ListNode(value);
	ListNode fast = head;
	ListNode slow = head;
	
	//����Ϊ��
	if(head == null)
		return node;
	
	//��һ��Ԫ�ؾʹ���value
        if(head.val > value){
		node.next = head;
		return node;
	}

	while(fast != null && fast.val < value){
		fast = fast.next;
	}

	while(slow.next != fast){
		slow = slow.next;
	}

	node.next = fast;
	slow.next = node;

	return head;

}