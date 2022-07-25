<template>
  <div>

    <Header />
    <!--    主体-->
    <div style="display: flex">

      <Aside />
      <!--      内容区-->
      <router-view style="flex: 1" />
    </div>
  </div>

</template>

<script>
import Header from "@/components/Header";
import Aside from "@/components/Aside";


export default {
  name: "Layout",
  components:{
    Header,
    Aside
  }
}
</script>

<style scoped>

</style>