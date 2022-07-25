<template>
  <meta name='referrer' content='no-referrer'>
  <div style="height: 60px;line-height: 60px;border-bottom: 1px solid #ccc;display: flex">
    <div style="width: 200px; padding-left: 35px; font-weight: bold;color: #ebb563"></div>
    <div style="flex: 1"></div>
    <div style="width: 120px">
      <el-dropdown>
      <span class="el-dropdown-link">
        {{user.name}}<i class="el-icon-arrow-down el-icon--right"></i>
      </span>
        <template #dropdown>
          <el-dropdown-menu>
            <el-dropdown-item @click="$router.push('/login')">退出系统</el-dropdown-item>
          </el-dropdown-menu>
        </template>
      </el-dropdown>
    </div>
  </div>
</template>

<script>
export default{
  name: "Header",

  data() {
    return {
      user:{}

    }
  },
  created() {
    let str=sessionStorage.getItem("user")||"{}"
    this.user=JSON.parse(str)
  }
}
</script>

<style scoped>

</style>
