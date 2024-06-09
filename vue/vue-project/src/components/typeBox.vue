<template>
    <div class="plusBox">
        <label>+</label><br />
        <input type="text" v-model.number="plusValue" />
    </div>
    <div class="minusBox">
        <label>-</label><br />
        <input type="text" v-model.number="minusValue" />
    </div>
    <div class="sumBox">
        <label>=</label><br />
        <div class="resultbox">{{ sum }}</div>
    </div>
</template>

<script>
export default {
    name: 'typeBox',
    data() {
        return {
            plusValue: 0,
            minusValue: 0,
        };
    },
    computed: {
        sum() {
            return this.plusValue + this.minusValue;
        },
    },
};
</script>
