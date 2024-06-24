function solution(numbers, k) {
    // (2 * (k - 1)) % numbers.length는 k번 던졌을 때의 위치를 계산
    const index = (2 * (k - 1)) % numbers.length;
    return numbers[index];
}

// k-1 후 2를 곱한 만큼 움직인다. 움직이는 거리가 배열의 길이를 초과한 경우를 대비해 배열 길이로
// 모듈러 연산을 수행.
// function solution(numbers, k) {
//     return numbers[(--k*2)%numbers.length];
// }

// 정수배열 numbers를 받고, k번째 배열의 번호가 무엇인지 리턴.
// numbers = [1,2,3,4], k=2 일때 3이 리턴.
//  1번부터 시작. 공을 던지면 3번이 받는다. 3번이 던지므로 k=2번째 3번이 출력
// 오른쪽으로 한 명을 건너뛰고 던질 수 있다. = 홀수

// numbers = [1, 2, 3, 4, 5, 6], k=5일때 3리턴.
// 1번은 첫 번째로 3번에게 공을 던집니다.
// 3번은 두 번째로 5번에게 공을 던집니다.
// 5번은 세 번째로 1번에게 공을 던집니다.
// 1번은 네 번째로 3번에게 공을 던집니다.
// 3번은 다섯 번째로 5번에게 공을 던집니다.

// function solution(numbers, k) {
//     let answer = [];
//     for (let i = 0; i < numbers.length; i++) {
//         if (i % 2 !== 0) {
//             answer.push(numbers[i]);
//         }
//     }

//     return answer[k];
// }
