public class Node<Item>
{
	Item value;
	Node next;
}

public class LinkedStackofStrings<Item> implements Iterable<Item>
{
	private Node<Item> first = null;
	
	public boolean isEmpty()
	{
		return first == null;
	}

	public Item pop()
	{
	        if(isEmpty())
	        {
			throw new NoSuchElementException("StackUnderflow");
		}
		Item item = first.item;
		first = first.next;
		return item;
	}

	public void push(Item item)
	{
		Node<Item> oldFirst = first;
		first = new Node<Item>();
		first.item = item;
		first.next = oldFirst;
			
	}

	public Iterator<Item> iterator()
        {
		return new LinkedListStackIterator<Item>(first); 
        }
}

public class LinkedListStackIterator<Item> implements Iterator<Item>
{
	private Node<Item> cur;

	public LinkedListStackIterator(Node<Item> first)
	{
		cur = first;
	}

	public boolean hasNext()
	{
		return cur != null;
	}

	public void remove()
	{
		throw new UnsupportedOperationException();
	}

	public Item next()
	{
		if(!hasNext())
		{
			throw new NoSuchElementException();
		}
		Item item = current.item;
		cur = cur.next;
		return item;
	}	
}