<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript">
        $(function() {
            /*初始化保存按钮*/
            $("#saveBanner").linkbutton({
                /*简洁模式按钮*/
                plain:true,
                /*单击事件*/
                onClick:function () {
                    /*初始化form表单,并且提交表单*/
                    $("#addBannerForm").form("submit",{
                        url:"${pageContext.request.contextPath}/carousel/CarousInsert.do",
                        onSubmit : function() {
                            //提交表表单前通常做表单验证
                            //调用表单的，validate方法
                            return $("#addBannerForm").form("validate");
                        },
                        success : function() {
                            //提交成功后的处理函数
                            // 关对话框
                            $("#addprintbox").dialog("close");
                            $.messager.show({
                                title : "提示",
                                msg : "添加成功！"
                            });
                            //添加成功后自动刷新页面
                            $("#t12").datagrid("load");
                        }
                    })
                }
            });
            /*初始化图片名*/
            $("#addBanTitle").textbox({
                required:true
            });
            /*初始化图片详情*/
            $("#addBanTesc").textbox({
                required: true
            });
            /*初始化选择图片*/
            $("#addBanImgPath").filebox({
                required:true
            })
            /*初始化状态*/
            $("#addBanStatus").textbox({
                required:true
            });
             /*初始化日期*/
            $("#addtimes").datebox({
                editable:false,
               required:true
            });
        });
</script>

<form method="post" id="addBannerForm" enctype="multipart/form-data">
    <%--name为实体类属性--%>
    图片名称:<input type="text" name="name"  id="addBanTitle"/></br></br>
    图片详情:<input type="text" name="description" id="addBanTesc"/></br></br>
    选择图片:<input  name="addFile" id="addBanImgPath"/></br></br>
    <%--通过select创建一个预定结构的下拉框--%>
    <label for="addbanStutas">图片状态</label>
    <select id="addbanStutas" class="easyui-combobox" name="status" style="width:200px;" data-options="editable:false">
        <option value="1">展示</option>
        <option value="0">不展示</option>
    </select></br></br>
        添加日期:<input type="text" name="uploaddate" id="addtimes"/><br>
    <%--保存按钮--%>
    <a id="saveBanner">保存</a>
</form>