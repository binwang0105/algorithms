class MyStack {
    
    Queue<Integer> queue = new LinkedList<Integer>();
    
    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        int size = queue.size();
        for(int i = 1; i <= size-1; i++)
             queue.add(queue.remove());
        queue.remove();
    }

    // Get the top element.
    public int top() {
        int size = queue.size();
        for(int i = 1; i <= size-1; i++)
            queue.add(queue.remove());
        int ret = queue.remove();
        queue.add(ret);
        return ret;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
}

//queue增加一个元素要使用add方法
//ref: http://www.cnblogs.com/end/archive/2012/10/25/2738493.html