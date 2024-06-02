<template>
    <div class="container">
        <Header />
        <router-view></router-view>
        <!-- router-view처럼 동적으로 변하는 페이지들은 pages폴더에 생성 -->
        <!-- 이미 main.js, index.js에서 router 사용 선언 해놨기에 따로 선언 불필요. -->
    </div>
</template>

<script>
import Header from '@/components/Header.vue';

export default {
    name: 'App',
    components: { Header },
};
</script>

<style>
@import url(https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css);

.fa {
    padding: 5px;
    width: 30px;
    text-align: center;
    text-decoration: none;
    margin: 5px 2px;
}
.fa-github {
    background: #3b5998;
    color: white;
}

.fa-blog {
    background-color: #bb0000;
    color: white;
}

.container {
    text-align: center;
    margin-top: 10px;
}
</style>
