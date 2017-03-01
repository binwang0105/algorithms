public class FixedSizeStack
{
	private String[] s;
	private int N = 0;

	public FixedSizeStack(int capacity)
	{
		s = new String[capacity];
	} 

	public boolean isEmpty
	{
		return N == 0;
	}

	public String pop()
	{
		String item = s[--N];
		s[N] = null;
		return item;
	}

	public void push(String item)
	{
		s[N++] = item;
	}
}