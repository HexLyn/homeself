function solution(array) {
    const frequency = {};

    array.forEach((num) => {
        frequency[num] = (frequency[num] || 0) + 1;
    });

    let maxFreq = 0;
    let answer = -1;
    let modeCount = 0;

    for (const num in frequency) {
        if (frequency[num] > maxFreq) {
            maxFreq = frequency[num];
            answer = Number(num);
            modeCount = 1;
        } else if (frequency[num] === maxFreq) {
            modeCount++;
        }
    }

    if (modeCount > 1) {
        return -1;
    }

    return answer;
}
