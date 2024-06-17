//함수를 선언할 때 함수 앞에 async를 붙여 선언 시,
//그 함수 안에서 await를 붙여 비동기 처리 하는 기능.

async function init() {
    const response = await fetch(
        'https://jsonplaceholder.typicode.com/users'
    );

    const users = await response.json();
    console.log(users);
}

init();
