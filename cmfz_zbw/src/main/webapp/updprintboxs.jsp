<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript">
      $(function(){
          $("#updateprintbox").form("load","${pageContext.request.contextPath}/carousel/CarouselSelect.do?carouselid="+ids);
          $("#upBanTitle").textbox({
             required:true
              //validType:'name'
          });
          $("#upBanTesc").textbox({
              required:true,
              validType:'description'
          });
          $("#upbanStutas").textbox({
              required:true,
              validType:'status'
          });
          $("#linBanner").linkbutton({
              onClick:function () {
                  $("#updateprintbox").form("submit",{
                     url:"${pageContext.request.contextPath}/carousel/CarousUpdate.do",
                      onSubmit:function () {
                          var x = $(this).form("validate");
                          return x;
                      },
                      success:function () {
                          $("#updprintbox").dialog("close");
                          $.messager.show({
                             title:"修改提示",
                              msg:"修改成功，新数据已经成功入库"
                          });
                          $("#t12").datagrid("reload");
                      }
                  });
              }
          });

      });

</script>
<form method="post" id="updateprintbox" enctype="multipart/form-data">
            <input type="hidden" name="carouselid" id="upBanid"/><br>
    图片名称:<input  id="upBanTitle" type="text" name="name"/></br></br>
    图片详情:<input type="text" name="description" id="upBanTesc"/></br></br>
    <%--通过select创建一个预定结构的下拉框--%>
    <label for="upbanStutas">图片状态</label>
    <select id="upbanStutas" class="easyui-combobox" name="status" style="width:200px;" data-options="editable:false">
        <option value="1">展示</option>
        <option value="0">不展示</option>
    </select></br></br>
    <%--保存按钮--%>
    <a id="linBanner">保存</a>
</form>