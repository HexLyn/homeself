let array = [1, 2, 7, 10, 11];

function solution(array) {
    array.sort((a,b) => a-b);

    const mid = math.floor(array.length / 2);


    return array(mid);
}

console.log(solution(array));