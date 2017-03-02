pubic class Queue<Item> implements Iterable<Item>
{
	private Node<Item> first, last;
	private int n;

	public Queue()
	{
		first = null;
		last = null;
	}
	
	public boolean isEmpty()
	{
		return first == null;	
	}
	
	public Node<Item> dequeue()
	{
		if(isEmpty())
			throw new NoSuchElementException("Queue underflow");
		Node<Item> item = first.item;
		first = first.next;
		if(isEmpty())
			last = null;
		return item;			
	}

	public void enqueue(Node item)
	{
		Node<Item> oldlast = last;
		last = new Node<Item>();
		last.item = item;
		last.next = null;
		if(isEmpty())
			first = last;
		else    oldlast.next = last;		
	}

	public Iterator<Item> iterator()
	{
		return new LinkedQueueIterator<Item>();
	}

	private class LinkedQueueIterator<Item> implements Iterator<Item>
	{

		private Node<Item> cur;
		
		public LinkedQueueIterator()
		{
			cur = first;
		}	
	
		public boolean hasNext()
		{
			return cur != null;
		}

		public Item Next()
		{
			if (!hasNext()) throw new NoSuchElementException();
			Item item = cur.item;
			cur = cur.next;
			return item;				
		}

		public void remove()
		{
			throw new UnsupportedOperationException();			
		}
	}
}