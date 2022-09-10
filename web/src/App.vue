<template>
  <NavBar />
  <router-view></router-view>
</template>

<script>
import NavBar from './components/NavBar.vue'
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap"
// import $ from 'jquery'

export default {
  components:{
    NavBar
  },
  setup(){
    // $.ajax({
    //   url: "http://127.0.0.1:3000/user/account/token/",
    //   type: "post",
    //   data: {
    //     username: "yzd",
    //     password: "yzd",
    //   },
    //   success(resp) {
    //     console.log(resp);
    //   },
    //   error(resp) {
    //     console.log(resp);
    //   }
    // })

    // $.ajax({
    //   url: "http://127.0.0.1:3000/user/account/info/",
    //   type: "get",
    //   headers: {
    //     Authorization: "Bearer " + "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI0OWExZGFhMjZhNmI0MjMwYjNhZjlhNDJmMmExNjc4MyIsInN1YiI6IjIiLCJpc3MiOiJzZyIsImlhdCI6MTY2MjczNzE3OCwiZXhwIjoxNjYzOTQ2Nzc4fQ.4kqQuUfTNLzoMHJ5Hc6CBlck19vax5rXqEBcoDipM7w"
    //   },
    //   success(resp) {
    //     console.log(resp);
    //   },
    //   error(resp) {
    //     console.log(resp);
    //   },
    // })

    // $.ajax({
    //   url: "http://127.0.0.1:3000/user/account/register/",
    //   type: "post",
    //   data: {
    //     username: "yzdd",
    //     password: "111",
    //     confirmedPassword: "111",
    //   },
    //   success(resp) {
    //     console.log(resp);
    //   },
    //   error(resp) {
    //     console.log(resp);
    //   },
    // })
  }
}
</script>

<style>
body {
  background-image: url("./assets/images/backgroundimg.png");
  background-size: cover;
}
</style>