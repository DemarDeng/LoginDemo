<template>
  <div style="padding: 10px">


  </div>
</template>
<script>
import request from "@/utils/request";

export default {
  meta: [
    { name: 'referrer', content: 'no-referrer' }
  ],

  name: "welcome",
  components:{

  },

  data(){
    return {
      user: {},
      form:{},
      dialogVisible: false,
      search: '',
      category:'',
      currentPage: 1,
      pageSize:10,
      total: 0,
      tableData: []
    }
  },
  created(){
    let userStr = sessionStorage.getItem("user") || "{}"
    this.user = JSON.parse(userStr)
  },
  methods: {

  }


}
</script>

<style scoped>

</style>