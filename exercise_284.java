class PeekingIterator implements Iterator<Integer> {

    Integer cache;
    Iterator it;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.it = iterator;
	    this.cache = (Integer)it.next();
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return this.cache;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int res = 0;
	    res = this.cache;
	    
	    this.cache = it.hasNext()? (Integer)it.next():null;
	    return res;
	}

	@Override
	public boolean hasNext() {
	    return it.hasNext() || this.cache != null;
	}
}