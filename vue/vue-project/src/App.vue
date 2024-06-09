<template>
    <div class="app">
        <div class="header">
            <h2>실험용</h2>
        </div>
        <div class="container">
            <typeBox />
        </div>
    </div>
</template>

<script>
import typeBox from './components/typeBox.vue';

export default {
    name: 'App',
    components: { typeBox },
};
</script>
