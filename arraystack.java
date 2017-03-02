public class FixedSizeStack<Item> implements Iterable<Item>
{
	private Item[] s;
	private int N = 0;

	public FixedSizeStack(int capacity)
	{
		s = (Item[])new Object[capacity];
	} 

	public boolean isEmpty
	{
		return N == 0;
	}

	public Item pop()
	{
		if(isEmpty())
			throw new NoSuchElementException();
		Item item = s[--N];
		s[N] = null;
		return item;
	}

	public void push(Item item)
	{
		s[N++] = item;
	}

	public ArrayStackIterator<Item> iterator()
	{
		return ArrayStackIterator<Item>();
	}

	private class ArrayStackIterator<Item> implements Iterator<Item>
	{
		private int i;

		public boolean hasNext()
		{
			return i < N;
		}

		public void remove()
		{
			throw new UnsupportedOperationException();
		}

		public Item next()
		{
			if(hasNext())
				throw new NoSuchElementException();

			return a[i--];
		}
	}

}