<template>
  <div class="login" style="width: 100%; height: 100vh;overflow: hidden">
    <div style="width:400px;height:360px;margin:130px 750px;background:white">
      <div style="color:#303133;font-size:30px;font-family:楷体;text-align: center;padding: 30px 0">欢迎登录</div>
      <el-form style="margin:0 40px" ref="form" :model="form" >
        <el-form-item >
          <el-input prefix-icon="el-icon-user-solid" v-model="form.tel" placeholder="手机号"></el-input>
        </el-form-item>
        <el-form-item >
          <el-input prefix-icon="el-icon-lock" v-model="form.password" placeholder="密码" show-password></el-input>
        </el-form-item>
        <el-form-item >
          <el-button style="width: 100%" type="primary" @click="login">登 录</el-button>
        </el-form-item>
        <el-form-item >
          <el-button style="width: 100%"  type="warning" @click="register">注册</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>

</template>

<script>
import request from "@/utils/request";
import router from "@/router";
export default {
  name: "Login",
  data() {
    return {
      form: {}
    }
  },
  methods: {
    login() {
      this.$refs['form'].validate((valid) => {
        if (valid) {
            request.post("/user/login", this.form).then(res => {
              if (res.code === '0') {
                this.$message({
                  type: "success",
                  message: "登录成功"
                })
                sessionStorage.setItem("user",JSON.stringify(res.data))
                this.$router.push("/welcome"); //登录成功之后进行页面的跳转，跳转到主页
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
    register() {
      router.push('/register')
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