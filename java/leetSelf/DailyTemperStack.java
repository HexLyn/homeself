class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        // temperatures는 각 날짜의 온도가 담긴 배열.
        // answer는 temperatures에서 각 날짜마다 더 높은 온도의 날이 오기까지 필요한 일수 배열.

        Stack<Integer> s = new Stack<>();
        // s라는 정수 스택 선언.

        for (int i = 0; i < temperatures.length; i++) {
            // for문을 통해 주어진 temperatures의 길이만큼 반복.
            while (!s.isEmpty() && temperatures[s.peek()] < temperatures[i]) {
                // 선언한 s가 비어있지 않고, s 스택의 마지막 온도가 현재 temperatures 온도보다 낮을 때.
                int prevDay = s.pop();
                // prevDay를 선언해서 s.pop()한 값이 저장됨.
                answer[prevDay] = i - prevDay;
                // 현재 인덱스(i)와 스택에서 꺼낸 인덱스(prevDay)의 차이를 계산하여 answer 배열에 저장.
            }
            s.push(i);
            // 스택에 현재 temperatures의 인덱스, 온도를 저장.
        }
        return answer;
    }
}

// [73,74,75,71,69,72,76,73]이 주어졌다고 할 때,
// 맨 처음(i=0)엔 s가 비어있으니 조건 충족 안됨. = s.push(0) 수행, s = [0].
// 현재 배열 answer = [0, 0, 0, 0, 0, 0, 0, 0]

// 그 다음(i=1) 74로, 스택이 비어있지않으며, temperatures[s.peek()=73] < temperatures[1]=74로 while문 충족.
// 저장했던 s = [0] 이 prevDay에 저장되며 제거(pop). s = []
// answer[prevDay => 0] = 1 - 0 =1. prevDay엔 0이 들어가고, answer[0] = 1이 저장.
// s.push(1)수행. s = [1].
// 현재 배열 answer = [1, 0, 0, 0, 0, 0, 0, 0]

// i=2 에선, temperatures[s.peek()] => temperatures[1] = 74 < temperatures[2]=75로 while문 충족.
// prevDay = s.pop(), prevDay = 1 저장. s = []
// answer[prevDay => 1] = 2 - 1 = 1, prevDay엔 1이 들어가고, answer[1] = 1이 저장.
// s.push(2)수행. s = [2]
// 현재 배열 answer = [1, 1, 0, 0, 0, 0, 0, 0]

// i=3 에선, temperatures[s.peek()] => temperatures[2] = 75 < temperatures[3] = 71로 while 충족 못함.
// s.push(3)수행. s = [2, 3]
// 현재 배열 answer = [1, 1, 0, 0, 0, 0, 0, 0] 변함없음(0).

// i=4 에선, temperatures[s.peek()] => temperatures[3] = 71 < temperatures[4] = 69로 while 충족 못함.
// s.push(4)수행. s = [2, 3, 4]
// 현재 배열 answer = [1, 1, 0, 0, 0, 0, 0, 0] 변함없음(0).

// i=5 에선, temperatures[s.peek()] => temperatures[4] = 69 < temperatures[5] = 72로 while문 충족.
// prevDay = s.pop(), prevDay = 4 저장. s = [2, 3]
// answer[prevDay => 4] = 5 - 4 = 1, prevDay엔 4가 들어가고, answer[4] = 1이 저장.
// 현재 배열 answer = [1, 1, 0, 0, 1, 0, 0, 0]
// while문이므로, temperatures[s.peek()] => temperatures[3] = 71 < temperatures[5] = 72로 while문 충족.
// prevDay = s.pop(), prevDay = 3 저장. s = [2]
// answer[prevDay => 3] = 5 - 3 = 2, prevDay엔 3이 들어가고, answer[3] = 2가 저장됨.
// s.push(5)수행. s = [2, 5]
// 현재 배열 answer = [1, 1, 0, 2, 1, 0, 0, 0]

// i=6 에선, temperatures[s.peek()] => temperatures[5] = 72 < temperatures[6] = 76으로 while문 충족.
// prevDay = s.pop(), prevDay = 5저장. s = [2]
// answer[prevDay =>5] = 6 - 5 = 1, prevDay엔 5가 들어가고, answer[5] = 1이 저장.
// 현재 배열 answer = [1, 1, 0, 2, 1, 1, 0, 0]
// while문이므로, temperatures[s.peek()] => temperatures[2] = 75 < temperatures[6] = 76으로 while문 충족.
//prevDay = s.pop(), prevDay = 2 저장. s = []
//answer[prevDay => 2] = 6 - 2 = 4, prevDay엔 2가 들어가고, answer[2] = 4가 저장됨.
//s.push(6)수행. s = [6]
// 현재 배열 answer = [1, 1, 4, 2, 1, 1, 0, 0]

//i=7 에선, temperatures[s.peek()] => temperatures[6] = 76 < temperatures[7] = 73으로 while 충족 못함.
//s.push(7)수행. s = [6,7]
// 현재 배열 answer = [1, 1, 4, 2, 1, 1, 0, 0] 변함없음(0).
