<template>
    <div className="">
        <img :src="member.photo" class="img" />
        <h4 class="mt-2">
            {{ member.name }}({{ member.cat }})
        </h4>
        <p>{{ member.talk }}</p>
        <a
            v-if="member.blog"
            class="fa fa-blog m-1"
            :href="member.blog"
        ></a>
        <a
            v-if="member.github"
            class="fa fa-github m-1"
            :href="member.github"
        ></a>
        <br /><br />
        <router-link to="/members"
            >멤버 목록으로</router-link
        >
    </div>
</template>

<script>
import { useRoute } from 'vue-router';
import members from '@/members.json';

export default {
    name: 'MemberInfo',
    setup() {
        const currentRoute = useRoute();
        const id = parseInt(currentRoute.params.id);
        const member = members.find((m) => m.id === id);
        return { member };
    },
};
</script>
