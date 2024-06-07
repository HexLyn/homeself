function solution(my_string, n) {
    let len = my_string.length;
    var answer = '';
    for (i = 0; i < len; i++) {
        answer += my_string[i].repeat(n);
    }
    return answer;
}

// ###구조분해할당 이용.
// function solution(my_string, n) {
//     var answer = [...my_string].map(v => v.repeat(n)).join("");
//     console.log(answer);
//     return answer;
// }
