import java.util.Stack;

public class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minList = new Stack<Integer>(); //historical min
    int min;
    
    public void push(int x){
    	if(stack.isEmpty()){
    		minList.push(x);
    		min = x;
    	}
    	else if(min >= x){
    		minList.push(x);
    		min = x;
    	}
    	stack.push(x);
    }
    
    public void pop(){
    	if(min == stack.peek()){
    		minList.pop();
    		min = minList.peek();
    	}
    	stack.pop();
    }
    
    public int getMin() {
        return minList.peek();
    }
    
    public void top(){
    	if(!stack.isEmpty()){
    		stack.peek();
    	}
    }
    
    public static void main(String[] args){
    	MinStack minList = new MinStack();
    	minList.push(2);
    	minList.push(0);
    	minList.push(3);
    	minList.push(0);
    	minList.pop();
    	System.out.println(minList.getMin());
    	minList.pop();
    	System.out.println(minList.getMin());
    	minList.pop();
    	System.out.println(minList.getMin());
    }
}