import './assets/main.css';
import typeBox from './components/typeBox.vue';

import { createApp } from 'vue';
import App from './App.vue';

createApp(App).component('typeBox', typeBox).mount('#app');
