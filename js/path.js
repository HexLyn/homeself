const path = require('path');

const fullpath = path.join('some', 'work', 'ex.txt');
// 경로 조각을 결합하여 하나의 경로 문자열 생성.
// 실제 연결 x

console.log(fullpath);
// 파일의 내용이 아니라 해당 경로를 표시해준다.

console.log(`파일 절대 경로 : ${__filename}`);

const dir = path.dirname(__filename);
console.log(`경로만 추출하기 : ${dir}`);

const fn = path.basename(__filename);
const fn2 = path.basename(__filename, '.js');

console.log(`파일 이름: ${fn}`);
console.log(`파일 이름만(확장자 제외): ${fn2}`);

const ext = path.extname(__filename);
console.log(`파일 확장자 : ${ext}`);
console.log(path.basename(__filename, ext));

const parsedPath = path.parse(__filename);
console.log(parsedPath);
