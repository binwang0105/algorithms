/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.*/

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            else if(s.charAt(i) == ')' && !stack.isEmpty() &&stack.peek() == '(')
                stack.pop();
            else if(s.charAt(i) == ']' && !stack.isEmpty() &&stack.peek() == '[')
                stack.pop();
            else if(s.charAt(i) == '}' && !stack.isEmpty() &&stack.peek() == '{')
                stack.pop();
            else
                return false;
        }
    return stack.isEmpty();
    }
}

// 1. Character是char的类
// 2. String判断当前位置上面的字符使用String.charAt()
// 3. 存在明显的顺序包含关系，需要用到栈