const order = (coffee, callback) => {
    console.log(`${coffee} 주문접수`);
    setTimeout(() => {
        callback(coffee);
    }, 3000);
};
const display = (result) => {
    console.log(`${result} 완료`);
};

//두 개 함수 구성.
//order는 coffee, 콜백 함수 두 개를 입력받는다.
//수행되면 바로 console.log 출력, 그다음 타임아웃 함수 시행.
//timeout에선 콜백(커피)를 3초 뒤 시행.
//해당 callback에 display함수 입력했으므로 3초 뒤 {coffee} 완료 출력.

order('달고나', display);
