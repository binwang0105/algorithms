public class Node
{
	String value;
	Node next;
}

public class LinkedStackofStrings
{
	private Node first = null;
	
	public boolean isEmpty()
	{
		return first == null;
	}

	public String pop()
	{
		String item = first.item;
		first = first.next;
		return item;
	}

	public void push(String item)
	{
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
			
	}
}