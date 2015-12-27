class MyQueue {
    // Push element x to the back of queue.
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> tmpStack = new Stack<Integer>();
    
    public void push(int x) {
        stack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while(!stack.isEmpty()){
            tmpStack.push(stack.peek());
            stack.pop();
        }
        tmpStack.pop();
        while(!tmpStack.isEmpty()){
            stack.push(tmpStack.peek());
            tmpStack.pop();
        }
    }

    // Get the front element.
    public int peek() {
        int ret;
        while(!stack.isEmpty()){
            tmpStack.push(stack.peek());
            stack.pop();
        }
        ret = tmpStack.peek();
        while(!tmpStack.isEmpty()){
            stack.push(tmpStack.peek());
            tmpStack.pop();
        }
        return ret;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.isEmpty();
    }
}

//keep 2 stack, one is used to push in and the other is a tmp stack
