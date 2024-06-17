let likePizza = true;

const pizza = new Promise((resolve, reject) => {
    if (likePizza) resolve('피자 주문');
    else reject('피자주문 안해');
});

console.log(pizza);
//이렇게 작성 시 Promise 객체 자체가 리턴된다.
// Promise { '피자 주문' }  <=결과값
//현재까지는 Promise 객체를 '생성만' 한 상태이다.

//Promise를 실행하기 위한 코드: then, catch
pizza
    .then((result) => console.log(result))
    .catch((err) => console.log(err));

//then: 성공
//catch: 실패
//finally: 항상

//Promise 체이닝
pizza.then((result) =>
    console.log(result).catch((err) => console.log(err))
);
