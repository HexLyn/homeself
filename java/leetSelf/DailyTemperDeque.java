class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] ans = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i] ){
                int prevDay = stack.pop();
                ans[prevDay] = i - prevDay;
            }
            stack.push(i);
        }
        return ans;
    }
}

// 정수 문자열 temperatures를 받는다.
// 각 배열의 정수들이 더 커지기까지 얼마나 기다려야 하는지 정수 배열로 출력.
// 더 커질일이 없다면 0반환.

