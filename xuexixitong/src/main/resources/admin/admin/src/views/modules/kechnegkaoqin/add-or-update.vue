
















<template>
    <div class="addEdit-block">
        <el-form
                class="detail-form-content"
                ref="ruleForm"
                :model="ruleForm"
                :rules="rules"
                label-width="80px"
                :style="{backgroundColor:addEditForm.addEditBoxColor}"
        >
            <el-row>

                                    <el-col :span="12">
                                        <el-form-item class="input" v-if="type!='info'"  label="课程名称" prop="kechengName">
                                            <el-input v-model="kechengForm.kechengName"
                                                      placeholder="课程名称" clearable readonly></el-input>
                                        </el-form-item>
                                        <div v-else>
                                            <el-form-item class="input" label="课程名称" prop="kechengName">
                                                <el-input v-model="ruleForm.kechengName"
                                                          placeholder="课程名称" readonly></el-input>
                                            </el-form-item>
                                        </div>
                                    </el-col>
                                     <el-col :span="12">
                                         <el-form-item class="input" v-if="type!='info'"  label="课程类型" prop="kechengValue">
                                             <el-input v-model="kechengForm.kechengValue"
                                                       placeholder="课程类型" clearable readonly></el-input>
                                         </el-form-item>
                                         <div v-else>
                                             <el-form-item class="input" label="课程类型" prop="kechengValue">
                                                 <el-input v-model="ruleForm.kechengValue"
                                                           placeholder="课程类型" readonly></el-input>
                                             </el-form-item>
                                         </div>
                                     </el-col>
                                     <el-col :span="12">
                                         <el-form-item class="input" v-if="type!='info'"  label="上课班级" prop="banjiValue">
                                             <el-input v-model="kechengForm.banjiValue"
                                                       placeholder="上课班级" clearable readonly></el-input>
                                         </el-form-item>
                                         <div v-else>
                                             <el-form-item class="input" label="上课班级" prop="banjiValue">
                                                 <el-input v-model="ruleForm.banjiValue"
                                                           placeholder="上课班级" readonly></el-input>
                                             </el-form-item>
                                         </div>
                                     </el-col>
                                    <el-col :span="12">
                                        <el-form-item class="input" v-if="type!='info'"  label="上课时间" prop="shangkeTime">
                                            <el-input v-model="kechengForm.shangkeTime"
                                                      placeholder="上课时间" clearable readonly></el-input>
                                        </el-form-item>
                                        <div v-else>
                                            <el-form-item class="input" label="上课时间" prop="shangkeTime">
                                                <el-input v-model="ruleForm.shangkeTime"
                                                          placeholder="上课时间" readonly></el-input>
                                            </el-form-item>
                                        </div>
                                    </el-col>
                                    <el-col :span="12">
                                        <el-form-item class="input" v-if="type!='info'"  label="下课时间" prop="xiakeTime">
                                            <el-input v-model="kechengForm.xiakeTime"
                                                      placeholder="下课时间" clearable readonly></el-input>
                                        </el-form-item>
                                        <div v-else>
                                            <el-form-item class="input" label="下课时间" prop="xiakeTime">
                                                <el-input v-model="ruleForm.xiakeTime"
                                                          placeholder="下课时间" readonly></el-input>
                                            </el-form-item>
                                        </div>
                                    </el-col>
                                    <input id="updateId" name="id" type="hidden">
                                   <el-col :span="12">
                                       <el-form-item class="input" v-if="type==='info'"  label="编号" prop="kechnegkaoqinUuidNumber">
                                           <el-input v-model="ruleForm.kechnegkaoqinUuidNumber"
                                                     placeholder="编号" readonly></el-input>
									   </el-form-item>
                                       <div v-else>
                                          
                                       </div>
                                   </el-col>
                                <input id="kechengId" name="kechengId" type="hidden">
                                   <el-col :span="12">
                                       <el-form-item class="input" v-if="type==='info'"  label="班级人数" prop="zongrenshu">
										   <el-input v-model="ruleForm.zongrenshu"
										             placeholder="班级人数" readonly></el-input>
                                       </el-form-item>
                                       <div v-else>
                                       </div>
                                   </el-col>
                                   <el-col :span="12">
                                       <el-form-item class="input" v-if="type==='info'"  label="已到人数" prop="yidaorenshu">
										   <el-input v-model="ruleForm.yidaorenshu"
										             placeholder="已到人数" readonly></el-input>
                                       </el-form-item>
                                       <div v-else>
                                       </div>
                                   </el-col>
                                   <el-col :span="12">
                                       <el-form-item class="input" v-if="type==='info'"  label="请假人数" prop="qingjiarenshu">
										<el-input v-model="ruleForm.qingjiarenshu"
										          placeholder="请假人数" readonly></el-input>
									   </el-form-item>
                                       <div v-else>
                                       </div>
                                   </el-col>
                                <el-col :span="24">
                                    <el-form-item v-if="type!='info'"  class="input" label="考勤结束时间" prop="kaoqinTime">
                                        <el-date-picker
                                                value-format="yyyy-MM-dd HH:ss:mm"
                                                v-model="ruleForm.kaoqinTime"
                                                type="datetime"
                                                placeholder="考勤结束时间">
                                        </el-date-picker>
                                    </el-form-item>
                                    <div v-else>
                                        <el-form-item v-if="ruleForm.kaoqinTime" label="考勤结束时间" prop="kaoqinTime">
                                            <span v-html="ruleForm.kaoqinTime"></span>
                                        </el-form-item>
                                    </div>
                                </el-col>



            </el-row>
            <el-form-item class="btn">
                <el-button v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
                <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
                <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
            </el-form-item>
        </el-form>


    </div>
</template>
<script>
    import styleJs from "../../../utils/style.js";
    // 数字，邮件，手机，url，身份证校验
    import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
    export default {
        data() {
            return {
                addEditForm:null,
                id: '',
                type: '',
                kechengForm: {},
                ro:{
                    kechnegkaoqinUuidNumber: false,
                    kechengId: false,
                    zongrenshu: false,
                    yidaorenshu: false,
                    qingjiarenshu: false,
                    kaoqinTime: false,
                },
                ruleForm: {
                    kechnegkaoqinUuidNumber: '',
                    kechengId: '',
                    yidaorenshu: 0,
                    qingjiarenshu: 0,
                    kaoqinTime: '',
                },
                kechengOptions : [],
                rules: {
                   kechnegkaoqinUuidNumber: [
                              { required: true, message: '编号不能为空', trigger: 'blur' },
                          ],
                   kechengId: [
                              { required: true, message: '课程不能为空', trigger: 'blur' },
                          ],
                   kaoqinTime: [
                              { required: true, message: '考勤时间不能为空', trigger: 'blur' },
                          ],
                }
            };
        },
        props: ["parent"],
        computed: {
        },
        created() {
            this.addEditForm = styleJs.addStyle();
            this.addEditStyleChange()
            this.addEditUploadStyleChange()
			
			if(this.$route.query.kechengId != null && this.$route.query.kechengId != "" && this.$route.query.kechengId != 'null'){
				this.ruleForm.kechengId = this.$route.query.kechengId
				this.kechengChange(this.ruleForm.kechengId )
			}
			
            //获取下拉框信息

         this.$http({
             url: `kecheng/page?page=1&limit=100`,
             method: "get"
         }).then(({ data }) => {
             if (data && data.code === 0) {
            this.kechengOptions = data.data.list;
        }
         });


        },
        methods: {
            // 下载
            download(file){

                window.open(`${file}`)
            },
			add(id){
				if (id) {
				    this.ruleForm.kechengId = id;
				}
			},
            // 初始化
            init(id,type) {
                if (id) {
                    this.id = id;
                    this.type = type;
                }
                if(this.type=='info'||this.type=='else'){
                    this.info(id);
                }
				
                // 获取学生信息
                this.$http({
                    url:`${this.$storage.get("sessionTable")}/session`,
                    method: "get"
                }).then(({ data }) => {
                    if (data && data.code === 0) {
                    var json = data.data;
                } else {
                    this.$message.error(data.msg);
                }
            });


            },
            kechengChange(id){
                    this.$http({
                        url: `kecheng/info/`+id,
                        method: "get"
                    }).then(({ data }) => {
                        if (data && data.code === 0) {
                        this.kechengForm = data.data;
                    }
                });
            },
            // 多级联动参数
            info(id) {
                this.$http({
                    url: `kechnegkaoqin/info/${id}`,
                    method: 'get'
                }).then(({ data }) => {
                    if (data && data.code === 0) {
                    this.ruleForm = data.data;
					this.kechengChange(data.data.kechengId)
                    //解决前台上传图片后台不显示的问题
                    let reg=new RegExp('../../../upload','g')//g代表全部
                } else {
                    this.$message.error(data.msg);
                }
            });
            },
            // 提交
            onSubmit() {
				this.ruleForm.kechnegkaoqinUuidNumber = this.getUUID()
                this.$refs["ruleForm"].validate(valid => {
                    if (valid) {
                        this.$http({
                            url:`kechnegkaoqin/${!this.ruleForm.id ? "save" : "update"}?banji=`+this.$route.query.banji,
                            method: "post",
                            data: this.ruleForm
                        }).then(({ data }) => {
                            if (data && data.code === 0) {
                            this.$message({
                                message: "操作成功",
                                type: "success",
                                duration: 1500,
                                onClose: () => {
									this.$router.push({
										path: 'kechnegkaoqin',
									})
								}
                        });
                        } else {
                            this.$message.error(data.msg);
							this.$router.push({
								path: 'kecheng',
							})
                        }
                    });
                    }
                });
            },
            // 获取uuid
            getUUID () {
                return new Date().getTime();
            },
            // 返回
            back() {
               this.$router.push({
               	path: 'kecheng',
               })
            },
			//图片
            addEditStyleChange() {
                this.$nextTick(()=>{
                    // input
                    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
                    el.style.height = this.addEditForm.inputHeight
                el.style.color = this.addEditForm.inputFontColor
                el.style.fontSize = this.addEditForm.inputFontSize
                el.style.borderWidth = this.addEditForm.inputBorderWidth
                el.style.borderStyle = this.addEditForm.inputBorderStyle
                el.style.borderColor = this.addEditForm.inputBorderColor
                el.style.borderRadius = this.addEditForm.inputBorderRadius
                el.style.backgroundColor = this.addEditForm.inputBgColor
            })
                document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
                    el.style.lineHeight = this.addEditForm.inputHeight
                el.style.color = this.addEditForm.inputLableColor
                el.style.fontSize = this.addEditForm.inputLableFontSize
            })
                // select
                document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
                    el.style.height = this.addEditForm.selectHeight
                el.style.color = this.addEditForm.selectFontColor
                el.style.fontSize = this.addEditForm.selectFontSize
                el.style.borderWidth = this.addEditForm.selectBorderWidth
                el.style.borderStyle = this.addEditForm.selectBorderStyle
                el.style.borderColor = this.addEditForm.selectBorderColor
                el.style.borderRadius = this.addEditForm.selectBorderRadius
                el.style.backgroundColor = this.addEditForm.selectBgColor
            })
                document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
                    el.style.lineHeight = this.addEditForm.selectHeight
                el.style.color = this.addEditForm.selectLableColor
                el.style.fontSize = this.addEditForm.selectLableFontSize
            })
                document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
                    el.style.color = this.addEditForm.selectIconFontColor
                el.style.fontSize = this.addEditForm.selectIconFontSize
            })
                // date
                document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
                    el.style.height = this.addEditForm.dateHeight
                el.style.color = this.addEditForm.dateFontColor
                el.style.fontSize = this.addEditForm.dateFontSize
                el.style.borderWidth = this.addEditForm.dateBorderWidth
                el.style.borderStyle = this.addEditForm.dateBorderStyle
                el.style.borderColor = this.addEditForm.dateBorderColor
                el.style.borderRadius = this.addEditForm.dateBorderRadius
                el.style.backgroundColor = this.addEditForm.dateBgColor
            })
                document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
                    el.style.lineHeight = this.addEditForm.dateHeight
                el.style.color = this.addEditForm.dateLableColor
                el.style.fontSize = this.addEditForm.dateLableFontSize
            })
                document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
                    el.style.color = this.addEditForm.dateIconFontColor
                el.style.fontSize = this.addEditForm.dateIconFontSize
                el.style.lineHeight = this.addEditForm.dateHeight
            })
                // upload
                let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
                document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
                    el.style.width = this.addEditForm.uploadHeight
                el.style.height = this.addEditForm.uploadHeight
                el.style.borderWidth = this.addEditForm.uploadBorderWidth
                el.style.borderStyle = this.addEditForm.uploadBorderStyle
                el.style.borderColor = this.addEditForm.uploadBorderColor
                el.style.borderRadius = this.addEditForm.uploadBorderRadius
                el.style.backgroundColor = this.addEditForm.uploadBgColor
            })
                document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
                    el.style.lineHeight = this.addEditForm.uploadHeight
                el.style.color = this.addEditForm.uploadLableColor
                el.style.fontSize = this.addEditForm.uploadLableFontSize
            })
                document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
                    el.style.color = this.addEditForm.uploadIconFontColor
                el.style.fontSize = this.addEditForm.uploadIconFontSize
                el.style.lineHeight = iconLineHeight
                el.style.display = 'block'
            })
                // 多文本输入框
                document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
                    el.style.height = this.addEditForm.textareaHeight
                el.style.color = this.addEditForm.textareaFontColor
                el.style.fontSize = this.addEditForm.textareaFontSize
                el.style.borderWidth = this.addEditForm.textareaBorderWidth
                el.style.borderStyle = this.addEditForm.textareaBorderStyle
                el.style.borderColor = this.addEditForm.textareaBorderColor
                el.style.borderRadius = this.addEditForm.textareaBorderRadius
                el.style.backgroundColor = this.addEditForm.textareaBgColor
            })
                document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
                    // el.style.lineHeight = this.addEditForm.textareaHeight
                    el.style.color = this.addEditForm.textareaLableColor
                el.style.fontSize = this.addEditForm.textareaLableFontSize
            })
                // 保存
                document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
                    el.style.width = this.addEditForm.btnSaveWidth
                el.style.height = this.addEditForm.btnSaveHeight
                el.style.color = this.addEditForm.btnSaveFontColor
                el.style.fontSize = this.addEditForm.btnSaveFontSize
                el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
                el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
                el.style.borderColor = this.addEditForm.btnSaveBorderColor
                el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
                el.style.backgroundColor = this.addEditForm.btnSaveBgColor
            })
                // 返回
                document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
                    el.style.width = this.addEditForm.btnCancelWidth
                el.style.height = this.addEditForm.btnCancelHeight
                el.style.color = this.addEditForm.btnCancelFontColor
                el.style.fontSize = this.addEditForm.btnCancelFontSize
                el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
                el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
                el.style.borderColor = this.addEditForm.btnCancelBorderColor
                el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
                el.style.backgroundColor = this.addEditForm.btnCancelBgColor
            })
            })
            },
            addEditUploadStyleChange() {
                this.$nextTick(()=>{
                    document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
                    el.style.width = this.addEditForm.uploadHeight
                el.style.height = this.addEditForm.uploadHeight
                el.style.borderWidth = this.addEditForm.uploadBorderWidth
                el.style.borderStyle = this.addEditForm.uploadBorderStyle
                el.style.borderColor = this.addEditForm.uploadBorderColor
                el.style.borderRadius = this.addEditForm.uploadBorderRadius
                el.style.backgroundColor = this.addEditForm.uploadBgColor
            })
            })
            },
        }
    };
</script>
<style lang="scss">
.editor{
        height: 500px;

    & /deep/ .ql-container {
          height: 310px;
      }
    }
    .amap-wrapper {
        width: 100%;
        height: 500px;
    }
    .search-box {
        position: absolute;
    }
    .addEdit-block {
        margin: -10px;
    }
    .detail-form-content {
        padding: 12px;
    }
    .btn .el-button {
        padding: 0;
    }</style>

