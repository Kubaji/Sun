<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<script type="text/javascript">

	//专辑名称
	$("#albumFromName").textbox({
			"required":true,
			"width":300,
	});
	//章节数量
	$("#albumFormCount").textbox({
			"required":true,
			"width":300,
			validType:"mobile['count']"
	});
	//专辑得分
	$("#albumFormScore").textbox({
			"required":true,
			"width":300,
			validType:"mobile['score']"
	});
	//专辑作者
	$("#albumFormAuthor").textbox({
			"required":true,
			"width":300,
	});
	//播音员
	$("#albumFormTeller").textbox({
			"required":true,
			"width":300,
	});
	//专辑简介
	$("#albumFormBrief").textbox({
		"required":true,
		"width":300,
		"height":100,
		"multiline":true,
	});
	//出版时间
	$("#albumFormPulishDate").datebox({
		"width":300,
		"required":true,
		"editable":false
	});
	//专辑封面
	$("#albumFormCoverPath").filebox({
		"required":true,
		"width":300,
		"buttonText":"图片路径",
		"buttonIcon":"icon-add",
	});
	//保存按钮
	$("#albumFormSaveBuuton").linkbutton({
			"iconCls":"icon-table_save",
			onClick:function(){
				$("#albumFrom").form("submit",{
					"url":"${pageContext.request.contextPath}/ad/insert.do",
					 onSubmit:function(){
						var valid=$(this).form("validate");
						console.log(valid);
						if(valid){
							return valid;
						}
							return valid;
						},
					success : function(){
					$("#actbInsertAlbumDialog").dialog("close");
							$.messager.show({
								"title":"保存成功",
								"msg":"新数据已入库"
							});
							$("#actb").treegrid("load");
					}
				});
			}
		});

	//重置按钮
	$("#albumFormResetBuuton").linkbutton({
			onClick:function(){
				$("#albumFrom").form("reset");
			}
		});
</script>


<form method="post" id="albumFrom" align="center" enctype="multipart/form-data">
	<div>专辑名称:<input id="albumFromName" name="name"/></div>
	<div>章节数量:<input id="albumFormCount" name="count"/></div>
	<div>专辑得分:<input id="albumFormScore"  name="score"/></div>
	<div>专辑作者:<input id="albumFormAuthor"  name="author"/></div>
	<div>播音员&nbsp; :&nbsp;<input id="albumFormTeller"  name="teller"/></div>
	<div>出版时间:<input id="albumFormPulishDate"  name="pulishDate"/></div>
	<div>专辑封面:<input id="albumFormCoverPath"  name="file1"/></div>
	<div>专辑简介:<input id="albumFormBrief"  name="brief"></div>
	<div><a id="albumFormSaveBuuton">保存</a><a id="albumFormResetBuuton">重置</a></div>
</form>