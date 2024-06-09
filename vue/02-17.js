let p1 = {
    name: '비싼거',
    quantity: 150,
    price: 10000,
    order: function () {
        // !this.amount는 amount가 false일 때 실행된다는 뜻
        // false는 undefined상태, 즉, "공백, 0, null, '', false ".
        // NaN는 true로 본다.
        if (!this.amount) {
            this.amount = this.quantity * this.price;
        }
        console.log('주문금액 : ' + this.amount);
    },

    discount(rate) {
        if (rate > 0 && rate <= 0.7) {
            this.amount =
                (1 - rate) * this.price * this.quantity;
        }
        console.log(
            100 * rate + '% 할인된 금액으로 구매합니다.'
        );
    },
};

p1.discount(0.2);
p1.order();
