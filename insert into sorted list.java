public ListNode insertSortedList(ListNode head, int value){ //插入需要两个指针
	
	ListNode node = new ListNode(value);
	ListNode fast = head;
	ListNode slow = head;
	
	//链表为空
	if(head == null)
		return node;
	
	//第一个元素就大于value
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