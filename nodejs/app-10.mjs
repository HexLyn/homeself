import * as say from './greeting-2.mjs';
// greeting-2의 두 함수 hi, goodbye(전부 다) 한꺼번에 say로 받고있다.

say.hi('홍길동');
say.goodbye('홍길동');
// 이때 say빼면 오류발생.
