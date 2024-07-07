class Solution {
public boolean solution(String s) {
//    풀이에 사용할 스택 "stack" 생성.
    Stack<Character> stack = new Stack<Character>();

//    향상된 for문을 사용.
//    char p 선언, s.toCharArray()로 String 형식인 s를 char 배열로 변환함.
//    ex) String s = 'JAVA' 일 때, char[] p = s.toCharArray(); 하면
//    p는 ['J', 'A', 'V', 'A']의 배열이 저장된다.
    for (char p : s.toCharArray()) {
//        배열에서 for문을 돌리며,
//        p[i]가 '('이면 위에서 만든 스택에 ')'를 넣는다.
//        p[i]가 '{'이면 위에서 만든 스택에 '}'를 넣는다.
//        p[i]가 '['이면 위에서 만든 스택에 ']'를 넣는다.
        if (p == '(') {
            stack.push(')');
        } else if (p == '{') {
            stack.push('}');
        } else if (p == '[') {
            stack.push(']');

//        stack이 비어있지 않으며, stack의 top이 p일 때, pop()을 한다.
        } else if (!stack.empty() && stack.peek() == p) {
            stack.pop();
        } else {
            return false;
        }
    }
//    '({})'이라는 배열 s가 들어올 경우,
//    p[0] ='(' , p[1] ='{', p[2] ='}' , p[3] =')'
//    이 들어오며, 해당 p배열을 for문을 돌리며 검사한다.
//    먼저 p[0] == '('이므로, 만들어둔 스택에 ')'이 들어간다(push).  = p[')']
//    두번째 p[1] == '{'이므로, 만들어둔 스택에 '}'이 들어간다.      = p[')', '}']
//    세번째 p[2] == '}'이다. else if (!stack.empty() && stack.peek() == p)조건에 해당.
//    그러므로 stack.pop() 수행.                                 = p[')']
//    마지막 p[3] == ')'이다. 여기서도 stack.pop() 수행.           = p[]
//    return stack.empty() => stack 배열이 비었다면 true반환.
//    올바르게 끝났으므로 true반환하며 종료.
//    만약 '(}{)'와 같이 올바르게 묶이지 않았다면 return false로 stack이 비어있지 않으므로 false.
    return stack.empty();
    }
};

// 유효한 괄호의 조건.
// 열린 괄호는 같은 모양의 닫힌괄호로 반드시 닫혀야 한다.
// 괄호의 순서를 지켜야 한다.
// 가까운 괄호들은 그에 대응되는, 같은 형식의 열린괄호가 있어야 한다.