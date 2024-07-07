class Solution {
public boolean solution(String s) {
    Stack<Character> stack = new Stack<Character>();

    for (char p : s.toCharArray()) {
        switch (p) {
            case '(' : stack.push(')'); break;
            case '{' : stack.push('}'); break;
            case '[' : stack.push(']'); break;
            default:
                if(!stack.isEmpty() && stack.peek()==p) {
                    stack.pop();
                } else {
                    return false;
                }
        }
    }
    return stack.isEmpty();
    }
};
