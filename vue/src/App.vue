<template>
  <div>
    <router-view />
  </div>
</template>

<!--作为一个根节点路由-->

<script>
import Header from "./components/Header";
import Aside from "./components/Aside";
export default{
  name: "App",
}
</script>
