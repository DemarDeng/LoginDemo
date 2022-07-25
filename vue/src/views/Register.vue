<template>
  <div class="login" style="width: 100%; height: 100vh;overflow: hidden">
    <div style="width:400px;height:320px;margin:130px 750px;background:white">
      <div style="color:#303133;font-size:30px;font-family:楷体;text-align: center;padding: 30px 0">欢迎登录</div>
      <el-form style="margin:0 40px" ref="form" :model="form" >
        <el-form-item >
          <el-input prefix-icon="el-icon-user-solid" v-model="form.tel" placeholder="手机号"></el-input>
        </el-form-item>
        <el-form-item >
          <el-input prefix-icon="el-icon-lock" v-model="form.password" placeholder="密码" show-password></el-input>
        </el-form-item>

        <el-form-item >
          <el-button style="width: 100%"  type="primary" @click="register">注册</el-button>
        </el-form-item>
        <el-form-item >
          <el-button style="width: 100%"  type="warning" @click="login">返回</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>

</template>

<script>
import request from "@/utils/request";
import router from "@/router";
export default {
  name: "Register",
  data() {
    return {
      form: {}
    }
  },
  methods: {
    register() {
      this.$refs['form'].validate((valid) => {
        if (valid) {
          this.form.role=1
          request.post("/user/register", this.form).then(res => {
            if (res.code === '0') {
              this.$message({
                type: "success",
                message: "注册成功"
              })
              sessionStorage.setItem("user",JSON.stringify(res.data))
              this.$router.push("/login"); //登录成功之后进行页面的跳转，跳转到主页
            } else {
              this.$message({
                type: "error",
                message: res.msg
              })
            }
          })
        }
      })
    },
    login() {
      router.push('/login')
    },
  }


}
</script>

<style scoped>
.login{
  background:url("../assets/bg.jpg");
  width: 100%;
  height: 100%;
  position:fixed;
  background-size:100% 100%;
}

</style>